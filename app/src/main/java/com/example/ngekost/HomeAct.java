package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeAct extends AppCompatActivity {
    LinearLayout btn_apart_detail;
    ImageView move_to_apart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_apart_detail = findViewById(R.id.btn_apart_detail);
        btn_apart_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotodetail = new Intent(HomeAct.this, DetailAct.class);
                startActivity(gotodetail);
            }
        });

        move_to_apart = findViewById(R.id.move_to_apart);
        move_to_apart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoapart = new Intent(HomeAct.this, DetailAct.class);
                startActivity(gotoapart);
            }
        });
    }
}
