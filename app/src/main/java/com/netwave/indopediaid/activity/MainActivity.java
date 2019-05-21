package com.netwave.indopediaid.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.netwave.indopediaid.R;
import com.netwave.indopediaid.adapter.ImageCarouselAdapter;
import com.netwave.indopediaid.payment.PaketData;
import com.netwave.indopediaid.payment.Pulsa;

import com.viewpagerindicator.CirclePageIndicator;

import java.io.InputStream;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public TextView tv_kategori, tv_diskon, tv_halal, tv_pulsa, tv_paketdata, tv_pln, tv_tagihanPLN, tv_air, tv_food, tv_fashion, tv_hand, tv_kesehatan;
    public String DATA_FROM_NET = "https://indopedia.id/Home/IndexApi/";

    private ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;

    private String[] urls = new String[] { "http://m.indopedia.id/mobile/img/carousel/samsata.jpg",
            "http://m.indopedia.id/mobile/img/carousel/keroncong-fes.jpg",
            "http://m.indopedia.id/mobile/img/carousel/iklan-pencerah-wajah.jpg" };


    //HomeModel model = null;
    String id;

    CardView cv_pulsa, cv_kategori, cv_diskon, cv_halal, cv_paketdata, cv2;

    private Toolbar mToolbar;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BaseApiService api = new BaseApiService();
        //model = api.GetHomeModelFromApiUrl(DATA_FROM_NET);

        //new DownloadImageFromInternet((ImageView) findViewById(R.id.banner1)).execute("http://indopedia.id/images/carousel/2980.jpg");

        //fungsi untuk carousel
        addCarousel();

        Intent i = getIntent();
        id = i.getStringExtra("id");

        tv_kategori = findViewById(R.id.tv_kategori);
        tv_diskon = findViewById(R.id.tv_diskon);
        tv_halal = findViewById(R.id.tv_halal);
        tv_pulsa = findViewById(R.id.tv_pulsa);
        tv_paketdata = findViewById(R.id.tv_paketdata);
        tv_pln = findViewById(R.id.tv_pln);
        tv_tagihanPLN = findViewById(R.id.tv_tagihanPLN);
        tv_air = findViewById(R.id.tv_tagihanAIR);
        tv_food = findViewById(R.id.tv_food);
        tv_fashion = findViewById(R.id.tv_fashion);
        tv_hand = findViewById(R.id.tv_handicraft);
        tv_kesehatan = findViewById(R.id.tv_kesehatan);

        cv_pulsa = findViewById(R.id.cv_pulsa);
        cv_kategori = findViewById(R.id.cv_kategori);
        cv_diskon = findViewById(R.id.cv_diskon);
        cv_halal = findViewById(R.id.cv_halal);
        cv_paketdata = findViewById(R.id.cv_paketdata);
        cv2 = findViewById(R.id.cv_handcraft);


        cv_pulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Pulsa.class);
                startActivity(i);
            }
        });

        cv_paketdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PaketData.class);
                startActivity(i);
            }
        });

        cv_kategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProdukList.class);
                startActivity(i);
            }
        });

        cv_diskon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProdukList.class);
                startActivity(i);
            }
        });

        cv_halal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProdukList.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Profile.class);
                startActivity(i);
            }
        });

        //menu samping
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        mNavigationView = findViewById(R.id.navigation_view);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.txtLogin:
                        Intent klikLogin = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(klikLogin);
                        return true;
                    case R.id.nav_home:
                        Intent klik = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(klik);
                        return true;
                    case R.id.nav_profile:
                        Intent klik_2 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(klik_2);
                        return true;
                    case R.id.nav_list:
                        Toast.makeText(getApplicationContext(), "It is Work", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_testPage:
                        Intent klik_5 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(klik_5);
                        return true;
                    case R.id.nav_bantuan:
                        Intent klik_4 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(klik_4);
                        return true;
                    case R.id.nav_blogs:
                        Toast.makeText(getApplicationContext(), "It is Work", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_about:
                        Intent kilik = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(kilik);
                        return true;
                    case R.id.nav_join:
                        Toast.makeText(getApplicationContext(), "It is Work", Toast.LENGTH_SHORT).show();
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

        mDrawerLayout = findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.openDrawer, R.string.closeDrawer) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        mDrawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    //addData ke Carousel
    private void addCarousel() {

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new ImageCarouselAdapter(MainActivity.this, urls));

        CirclePageIndicator indicator = findViewById(R.id.indicatorMain);

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
