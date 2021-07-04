package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class DetailAct extends AppCompatActivity {
    Button btn_sewa_now;
    LinearLayout btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btn_sewa_now = findViewById(R.id.btn_sewa_now);
        btn_sewa_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(DetailAct.this, HomeAct.class);
                startActivity(gotohome);
            }
        });


        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohomepage = new Intent(DetailAct.this, HomeAct.class);
                startActivity(gotohomepage);
            }
        });
    }
}

