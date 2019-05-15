package com.netwave.indopediaid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.netwave.indopediaid.R;

public class ProdukList extends AppCompatActivity {

    CardView cv1, cv2, cv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produk_list);

        cv1 = findViewById(R.id.cv_item_1);
        cv2 =findViewById(R.id.cv_item_2);
        cv3 = findViewById(R.id.cv_item_5);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProdukList.this, ProdukDetail.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProdukList.this, ProdukDetail.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProdukList.this, ProdukDetail.class);
                startActivity(i);
            }
        });
    }
}
