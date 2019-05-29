package frontend.netwave.indopediaid.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import frontend.netwave.indopediaid.fragment.*;

public class ProfileTabAdapter extends FragmentStatePagerAdapter {

    public ProfileTabAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Ringkasan();
        }else if(position==1){
            return new InfoAkun();
        }else if(position==2){
            return new BukuAlamat();
        } else if(position==3){
            return new RiwayatOrder();
        } else if(position==4){
            return new Whislist();
        } else if(position==5){
            return new Newsletter();
        } else if(position==6){
            return new Rewards();
        } else if(position==7){
            return new Voucher();
        } else {
            return new Ringkasan();
        }
    }

    @Override
    public int getCount() {
        return 9;
    }
}

