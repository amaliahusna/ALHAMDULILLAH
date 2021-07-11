package com.example.ngekost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInAct extends AppCompatActivity {

    TextView btn_new_account;
    Button btn_sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //memanggil kelas untuk menyelesaikan pembuatan aktivitas
        setContentView(R.layout.activity_sign_in); //menghubungkan kelas java dengan layout

        //menjelaskan btn new account. jika btn new account di klik maka akan masuk ke tampilan Register One
        //to register
        btn_new_account = findViewById(R.id.btn_new_account);
        btn_new_account.setOnClickListener(new View.OnClickListener() { //mendaftarkan  pendengar onClick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent gotoregisterone = new Intent(SignInAct.this, RegisterOneAct.class); //untuk berpindah antar activity
                startActivity(gotoregisterone);
            }
        });

        //menjelaskan btn sign in. jika btn sign in di klik maka akan masuk ke tampilan Home
        //to home
        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(new View.OnClickListener() { //mendaftarkan pendengar onClick dengan implementasi di atas
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(SignInAct.this, HomeAct.class); //untuk berpindah antar activity
                startActivity(gotohome);
            }
        });
    }

}
