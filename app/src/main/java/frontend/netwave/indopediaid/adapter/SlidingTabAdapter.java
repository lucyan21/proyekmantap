package frontend.netwave.indopediaid.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import frontend.netwave.indopediaid.fragment.*;

public class SlidingTabAdapter extends FragmentStatePagerAdapter {

    public SlidingTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new DeskripsiProduk();
        }else if(position==1){
            return new SpesifikasiProduk();
        }else {
            return new UlasanProduk();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

