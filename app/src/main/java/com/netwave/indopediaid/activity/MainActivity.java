package com.netwave.indopediaid.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.netwave.indopediaid.R;
import com.netwave.indopediaid.payment.PaketData;
import com.netwave.indopediaid.payment.Pulsa;

public class MainActivity extends AppCompatActivity {

    public TextView tv_kategori, tv_diskon, tv_halal, tv_pulsa, tv_paketdata, tv_pln, tv_tagihanPLN, tv_air, tv_food, tv_fashion, tv_hand, tv_kesehatan;
    public String DATA_FROM_NET = "https://indopedia.id/Home/IndexApi/";

    //HomeModel model = null;
    String id;

    CardView cv_pulsa, cv_kategori, cv_diskon, cv_halal, cv_paketdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BaseApiService api = new BaseApiService();
        //model = api.GetHomeModelFromApiUrl(DATA_FROM_NET);

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

    }
}
