package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

//Jika kita mengeklik aplikasi ngekost maka akan muncul tampilan splash, jika tampilan splash sudah muncul
//maka akan muncul tampilan Get Started
public class SplashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //memanggil kelas untuk menyelesaikan pembuatan aktivitas
        setContentView(R.layout.activity_main); //menghubungkan kelas java dengan layout
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // merubah activity ke activity lain
                Intent gogetStrarted = new Intent(SplashAct.this, GetStartedAct.class); //untuk berpindah antar activity
                startActivity(gogetStrarted);
                finish();
            }
        }, 3000);
    }
}