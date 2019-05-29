package frontend.netwave.indopediaid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import frontend.netwave.indopedia.R;

public class ck_Payment extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ck_payment);

        btn1 = findViewById(R.id.btn_buynow);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ck_Payment.this, ck_Sum.class);
                startActivity(i);
            }
        });
    }
}
