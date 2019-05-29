package frontend.netwave.indopediaid.categories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import frontend.netwave.indopedia.R;

public class ct_All extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ct_all);

        cv1 = findViewById(R.id.cv_kat_1);
        cv2 = findViewById(R.id.cv_kat_2);
        cv3 = findViewById(R.id.cv_kat_3);
        cv4 = findViewById(R.id.cv_kat_4);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ct_All.this, ct_Handcraft.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ct_All.this, ct_Fashion.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ct_All.this, ct_Healthcare.class);
                startActivity(i);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ct_All.this, ct_Food.class);
                startActivity(i);
            }
        });

    }
}
