package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisterTwoAct extends AppCompatActivity {

    LinearLayout btn_back;
    Button btn_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //memanggil kelas untuk menyelesaikan pembuatan aktivitas
        setContentView(R.layout.activity_register_two); //menghubungkan kelas java dengan layout

        //menjelaskan btn back. jika btn back di klik maka akan masuk ke tampilan Register One
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onClick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent backtoprev = new Intent(RegisterTwoAct.this, RegisterOneAct.class); //untuk berpindah antar activity
                startActivity(backtoprev);
            }
        });

        //menjelaskan btn continue. jika btn continue di klik maka akan masuk ke tampilan Success Register
        btn_continue = findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onclick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent gotosucces = new Intent(RegisterTwoAct.this, SuccessRegisterAct.class); //untuk berpindah antar activity
                startActivity(gotosucces);
            }
        });
    }
}
