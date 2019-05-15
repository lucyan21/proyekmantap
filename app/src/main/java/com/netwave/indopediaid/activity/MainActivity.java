package com.netwave.indopediaid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.netwave.indopediaid.R;

public class MainActivity extends AppCompatActivity {

    public TextView tv_kategori, tv_diskon, tv_halal, tv_pulsa, tv_paketdata, tv_pln, tv_tagihanPLN, tv_air, tv_food, tv_fashion, tv_hand, tv_kesehatan;
    public String DATA_FROM_NET = "https://indopedia.id/Home/IndexApi/";

    //HomeModel model = null;
    String id;

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

    }
}
