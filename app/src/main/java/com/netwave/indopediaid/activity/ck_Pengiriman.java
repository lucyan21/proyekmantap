package com.netwave.indopediaid.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.netwave.indopediaid.R;
import com.netwave.indopediaid.adapter.ShippingTabAdapter;

public class ck_Pengiriman extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ShippingTabAdapter slidingTabAdapter;

    //for the tab's items
    private TabLayout.Tab posindo;
    private TabLayout.Tab jne;
    private TabLayout.Tab ncs;
    private TabLayout.Tab sicepat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ck_pengiriman);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.pager);

        //initialize the adapter
        slidingTabAdapter = new ShippingTabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(slidingTabAdapter);

        //set your tab's item
        posindo = tabLayout.newTab();
        jne = tabLayout.newTab();
        ncs = tabLayout.newTab();
        sicepat = tabLayout.newTab();

        //labeling the tab's items
        posindo.setIcon(R.drawable.ship_posindonesia);
        jne.setIcon(R.drawable.ship_jne);
        ncs.setIcon(R.drawable.ship_ncs);
        sicepat.setIcon(R.drawable.ship_sicepat);


        //set the index of the tab's items
        tabLayout.addTab(posindo, 0);
        tabLayout.addTab(jne,1);
        tabLayout.addTab(ncs,2);
        tabLayout.addTab(sicepat, 3);

        //set tab selector color
        tabLayout.setTabTextColors(ContextCompat.getColorStateList(this, R.color.tab_selector));

        //set the indicator
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.warnaUtama));

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
