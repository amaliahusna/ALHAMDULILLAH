package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisterOneAct extends AppCompatActivity {
    LinearLayout btn_back;
    Button btn_continue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //memanggil kelas untuk menyelesaikan pembuatan aktivitas
        setContentView(R.layout.activity_register_one); //menghubungkan kelas java dengan layout

        //menjelaskan btn bck. jika btn back di klik maka akan masuk ke tampilan Sign In
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onclick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent bactosignin = new Intent(RegisterOneAct.this, SignInAct.class); //untuk berpindah antar activity
                startActivity(bactosignin);
            }
        });

        //menjelaskan btn continue. jika btn continue di klik maka akan masuk ke tampilan Register Two
        btn_continue = findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onClick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent gottonexregister = new Intent(RegisterOneAct.this, RegisterTwoAct.class); //untuk berpindah antar activity
                startActivity(gottonexregister);
            }
        });
    }
}
