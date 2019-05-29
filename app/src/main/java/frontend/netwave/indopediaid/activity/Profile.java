package frontend.netwave.indopediaid.activity;

import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import frontend.netwave.indopedia.R;
import frontend.netwave.indopediaid.adapter.ProfileTabAdapter;

public class Profile extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ProfileTabAdapter slidingTabAdapter;

    //for the tab's items
    private TabLayout.Tab ringkasan;
    private TabLayout.Tab info_akun;
    private TabLayout.Tab buku_alamat;
    private TabLayout.Tab riwayat_order;
    private TabLayout.Tab whislist;
    private TabLayout.Tab newsletter;
    private TabLayout.Tab rewards;
    private TabLayout.Tab voucher;
    private TabLayout.Tab samsata;

    //for get current item
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_profile);

        tabLayout = findViewById(R.id.tablayoutProfile);
        viewPager = findViewById(R.id.pagerProfile);

        //initialize the adapter
        slidingTabAdapter = new ProfileTabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(slidingTabAdapter);

        //set your tab's item
        ringkasan = tabLayout.newTab();
        info_akun = tabLayout.newTab();
        buku_alamat = tabLayout.newTab();
        riwayat_order = tabLayout.newTab();
        whislist = tabLayout.newTab();
        newsletter = tabLayout.newTab();
        rewards = tabLayout.newTab();
        voucher = tabLayout.newTab();
        samsata = tabLayout.newTab();

        //labeling the tab's items
        ringkasan.setText("Ringkasan");
        info_akun.setText("Informasi Akun");
        buku_alamat.setText("Buku Alamat");
        riwayat_order.setText("Riwayat Pesanan");
        whislist.setText("Whislist");
        newsletter.setText("Pengaturan Newsletter");
        rewards.setText("Point and Rewards");
        voucher.setText("Voucher");
        samsata.setText("Samsata");

        ringkasan.setIcon(R.drawable.ic_list);
        info_akun.setIcon(R.drawable.ic_profile);
        buku_alamat.setIcon(R.drawable.ic_location);
        riwayat_order.setIcon(R.drawable.ic_tasorder);
        whislist.setIcon(R.drawable.ic_favorite);
        newsletter.setIcon(R.drawable.ic_mail);
        rewards.setIcon(R.drawable.ic_rewards);
        voucher.setIcon(R.drawable.ic_voucher);
        samsata.setIcon(R.drawable.ic_list);



        //set the index of the tab's items
        tabLayout.addTab(ringkasan, 0);
        tabLayout.addTab(info_akun,1);
        tabLayout.addTab(buku_alamat,2);
        tabLayout.addTab(riwayat_order,3);
        tabLayout.addTab(whislist,4);
        tabLayout.addTab(newsletter,5);
        tabLayout.addTab(rewards,6);
        tabLayout.addTab(voucher,7);
        tabLayout.addTab(samsata,8);

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
}

