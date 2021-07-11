package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccessRegisterAct extends AppCompatActivity {
    Button btn_explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //memanggil kelas untuk menyelesaikan pembuatan aktivitas
        setContentView(R.layout.activity_success_register); //menghubungkan kelas java dengan layout

        //menjelaskan btn explore. jika btn explore di klik maka akan masuk ke tampilan Home
        btn_explore =  findViewById(R.id.btn_explore);
        btn_explore.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onClick dengan implementasi  di atas
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(SuccessRegisterAct.this, HomeAct.class); //untuk berpindah antar activity
                startActivity(gotohome);
            }
        });
    }
}
