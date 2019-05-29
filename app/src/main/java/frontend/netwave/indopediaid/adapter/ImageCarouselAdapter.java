package frontend.netwave.indopediaid.adapter;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import frontend.netwave.indopedia.R;

public class ImageCarouselAdapter extends PagerAdapter {

    private String[] urls;
    private LayoutInflater inflater;
    private Context context;

    public ImageCarouselAdapter (Context context, String[] urls) {
        this.context = context;
        this.urls = urls;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return urls.length;
    }

    @Override
    public Object instantiateItem(ViewGroup view, final int position) {
        View imageLayout = inflater.inflate(R.layout.content_main, view, false);

        assert imageLayout != null;
        final ImageView imageView = (ImageView) imageLayout
                .findViewById(R.id.image);

        Glide.with(context)
                .load(urls[position])
                .into(imageView);

        /** imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position == 0){
                    Intent intent = new Intent();
                    intent.setData(Uri.parse("http://www.google.com"));
                    context.startActivity(intent);

                } else if(position == 1){
                    Intent intent = new Intent(context, Page_Login.class);
                    context.startActivity(intent);

                } else {
                    Toast.makeText(context, "Ini Banner 3", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

        view.addView(imageLayout, 0);

        return imageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

}

