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
    protected void onCreate(Bundle savedInstanceState) { //
        super.onCreate(savedInstanceState); //memanggil kelas untuk menyelesaikan pembuatan aktivitas
        setContentView(R.layout.activity_detail); //menghubungkan kelas java dengan layout

        //menjelaskan btn pesan, jika kita mengeklik btn pesan maka akan kembali ke tampilan home
        btn_sewa_now = findViewById(R.id.btn_sewa_now);
        btn_sewa_now.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onClick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(DetailAct.this, HomeAct.class); //untuk berpindah antar activity
                startActivity(gotohome);
            }
        });

        //menjelaskan btn back, jika kita mengeklik btn kembali maka akan kembali ke tampilan home
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onClick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent gotohomepage = new Intent(DetailAct.this, HomeAct.class); //untuk berpindah antar activity
                startActivity(gotohomepage);
            }
        });
    }
}

