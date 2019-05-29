package frontend.netwave.indopediaid.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.Timer;
import java.util.TimerTask;

import frontend.netwave.indopediaid.activity.ck_Produk;
import frontend.netwave.indopediaid.adapter.ImageProdukAdapter;
import frontend.netwave.indopediaid.adapter.SlidingTabAdapter;
import frontend.netwave.indopedia.R;

public class ProdukDetail extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SlidingTabAdapter slidingTabAdapter;

    //for the tab's items
    private TabLayout.Tab deskripsi;
    private TabLayout.Tab spesifikasi;
    private TabLayout.Tab ulasan;

    private ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private String[] urls = new String[] { "http://indopedia.id/images/product/1436.jpg",
            "http://indopedia.id/images/product/1437.jpg",
            "http://indopedia.id/images/product/1438.jpg",
            "http://indopedia.id/images/product/1439.jpg",
            "http://indopedia.id/images/product/1440.jpg"};

    public TextView tv1,tv2,tv3, tv_statusStok, tv_nmtoko, tv_jmlUlasan;
    public Button btn_beli;
    ImageView imv_tblback, imv_troli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produk_detail);

        Intent i = getIntent();
        String id = i.getStringExtra("id");

        tv1 = findViewById(R.id.tv_NamaProduk);
        tv1.setText("TAS RANSEL AVTECH QARANI - KANAKAGEAR");

        tv2 = findViewById(R.id.tv_HargaProduk);
        tv2.setText("Rp 275,000");
        tv3 = findViewById(R.id.tv_lastview);
        tv_statusStok = findViewById(R.id.tv_statusStok);
        tv_nmtoko = findViewById(R.id.tv_nmtoko);
        tv_jmlUlasan = findViewById(R.id.tv_jmlUlasan);
        imv_tblback = findViewById(R.id.imv_tblback);
        imv_troli = findViewById(R.id.imv_troli);

        btn_beli = findViewById(R.id.btn_beli1);

        imv_tblback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        imv_troli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProdukDetail.this, ck_Produk.class);
                startActivity(i);
            }
        });
        btn_beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProdukDetail.this, ck_Produk.class);
                startActivity(i);
            }
        });

        //fungsi untuk carousel
        addCarousel();

        //sliding tab detail produk
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.pagerDetailProduk);
        //initialize the adapter
        slidingTabAdapter = new SlidingTabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(slidingTabAdapter);
        //set your tab's item
        deskripsi = tabLayout.newTab();
        spesifikasi = tabLayout.newTab();
        ulasan = tabLayout.newTab();
        //labeling the tab's items
        deskripsi.setText("Deskripsi");
        spesifikasi.setText("Spesifikasi");
        ulasan.setText("Ulasan");
        //set the index of the tab's items
        tabLayout.addTab(deskripsi, 0);
        tabLayout.addTab(spesifikasi,1);
        tabLayout.addTab(ulasan,2);
        //set tab selector color
        tabLayout.setTabTextColors(ContextCompat.getColorStateList(this, R.color.tab_selector));
        //set the indicator
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.teks));
        // switch the fragment when the current fragment was slided.
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        // switch the fragment when the tab item was clicked
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }
            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });
    }

    //addData ke Carousel
    private void addCarousel() {

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new ImageProdukAdapter(ProdukDetail.this, urls));

        CirclePageIndicator indicator = findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

        //Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES = urls.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };

        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;
            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) { }

            @Override
            public void onPageScrollStateChanged(int pos) { }
        });
    }
}
