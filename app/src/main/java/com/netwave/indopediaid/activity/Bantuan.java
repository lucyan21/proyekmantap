package com.netwave.indopediaid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.netwave.indopediaid.R;

public class Bantuan extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bantuan);

        cv1 = findViewById(R.id.cv_Belanja);
        cv2 = findViewById(R.id.cv_Pengiriman);
        cv3 = findViewById(R.id.cv_Pembayaran);
        cv4 = findViewById(R.id.cv_lacak);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bantuan.this, PanduanBelanja.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bantuan.this, PanduanPengiriman.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bantuan.this, PanduanPembayaran.class);
                startActivity(i);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bantuan.this, PanduanLacak.class);
                startActivity(i);
            }
        });
    }
}
