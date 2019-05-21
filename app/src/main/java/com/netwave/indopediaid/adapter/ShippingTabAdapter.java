package com.netwave.indopediaid.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.netwave.indopediaid.fragment.*;

public class ShippingTabAdapter extends FragmentStatePagerAdapter {

    public ShippingTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new PosIndo_ship();
        }else if(position==1){
            return new JNE_ship();
        }else if(position==2){
            return new NCS_ship();
        } else {
            return new SiCepat_ship();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
