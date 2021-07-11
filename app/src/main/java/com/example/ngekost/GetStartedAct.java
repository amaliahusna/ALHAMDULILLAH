package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedAct extends AppCompatActivity {
    Button btn_mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //memanggil kelas untuk menyelesaikan pembuatan aktivitas
        setContentView(R.layout.activity_get_started); //menghubungkan kelas java dengan layout

        //menjelaskan btn mulai, jika kita mengeklik btn mulai maka akan ke tampilan Sign In Act
        btn_mulai = findViewById(R.id.btn_mulai);
        btn_mulai.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onClick dengan implementasi di atas
            @Override
            public void onClick(View view) {
                Intent gotosign = new Intent(GetStartedAct.this, SignInAct.class); //untuk berpindah antar activity
                startActivity(gotosign);
                //finish();
            }
        });

    }
}
