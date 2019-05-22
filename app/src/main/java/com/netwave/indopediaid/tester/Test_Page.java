package com.netwave.indopediaid.tester;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.netwave.indopediaid.R;
import com.netwave.indopediaid.adapter.ExpandableListAdapter;
import com.netwave.indopediaid.activity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;

public class Test_Page extends AppCompatActivity {

    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToogle;
    String mActivityTile;
    String[] items;

    ExpandableListAdapter adapter;
    ExpandableListView expandableListView;
    NavigationView mNavigationView;
    List<String> lstTitle;
    Map<String, List<String>> lstChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_page);

        //init view
        mDrawerLayout = findViewById(R.id.drawer_layout);
        expandableListView = findViewById(R.id.navList);

        //initItems();
        
        //View listHeaerView = getLayoutInflater().inflate(R.layout.layout_header, null, false);
        //expandableListView.addHeaderView(listHeaerView);

        genData();
        addDrawersItem();
        setupDrawer();
        
        if (savedInstanceState == null)
            selectFirstItemAsDefault();

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setTitle("tester");

        mNavigationView = findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.txtLogin:
                        Intent klikLogin = new Intent(Test_Page.this, Page_Login.class);
                        startActivity(klikLogin);
                        return true;
                    case R.id.nav_home:
                        Intent klik = new Intent(Test_Page.this, MainActivity.class);
                        startActivity(klik);
                        return true;
                    case R.id.nav_profile:
                        Intent klik_2 = new Intent(Test_Page.this, Profile.class);
                        startActivity(klik_2);
                        return true;
                    case R.id.nav_list:
                        Toast.makeText(getApplicationContext(), "It is Work", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_testPage:
                        Intent klik_5 = new Intent(Test_Page.this, ck_Payment.class);
                        startActivity(klik_5);
                        return true;
                    case R.id.nav_bantuan:
                        Intent klik_4 = new Intent(Test_Page.this, ck_Pengiriman.class);
                        startActivity(klik_4);
                        return true;
                    case R.id.nav_blogs:
                        Toast.makeText(getApplicationContext(), "It is Work", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_about:
                        Intent kilik = new Intent(Test_Page.this, ck_Produk.class);
                        startActivity(kilik);
                        return true;
                    case R.id.nav_join:
                        Intent i = new Intent(Test_Page.this, ck_Sum.class);
                        startActivity(i);
                        return true;
                    case R.id.nav_cs:
                        Toast.makeText(getApplicationContext(), "It is Work", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_setting:
                        Toast.makeText(getApplicationContext(), "It is Work", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Ada Kesalahan ", Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToogle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToogle.onConfigurationChanged(newConfig);
    }

    private void selectFirstItemAsDefault() {
    }

    private void setupDrawer() {
        mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.openDrawer, R.string.closeDrawer);
        mDrawerToogle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToogle);
    }

    private void addDrawersItem() {
        adapter = new ExpandableListAdapter(this, lstTitle, lstChild);
        expandableListView.setAdapter(adapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {

            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {
                //getSupportActionBar().setTitle("test");
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long l) {
                String selectedItem = ((List)(lstChild.get(lstTitle.get(groupPosition))))
                        .get(childPosition).toString();
                //getSupportActionBar().setTitle(selectedItem);

                mDrawerLayout.closeDrawer(GravityCompat.START);
                return false;
            }
        });
    }

    private void genData() {
        List<String> title = Arrays.asList("Akun Saya", "Bantuan");
        List<String> childitem = Arrays.asList("Ringkasan", "Informasi Akun", "Buku Alamat", "Riwayat Pemesanan", "Whislist", "News Letter", "Points And Rewards", "Voucher");
        //List<String> child = Arrays.asList("G", "H", "I");

        lstChild = new TreeMap<>();
        lstChild.put(title.get(0), childitem);
        lstChild.put(title.get(1), childitem);
        //lstChild.put(title.get(1), child);

        lstTitle = new ArrayList<>(lstChild.keySet());
    }

    private void initItems() {
        items = new String[] {"Akun Saya", "Bantuan"};
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.item_navigasi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (mDrawerToogle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
