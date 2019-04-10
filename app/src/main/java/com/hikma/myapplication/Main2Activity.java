package com.hikma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //get intent
        Intent intent = getIntent();
        //get Extra
        String nama = intent.getStringExtra("samsudin");
        TextView nm = (TextView) findViewById(R.id.namaView);
        nm.setText(nama);
        String email = intent.getStringExtra("samsudin@gmail.com");
        TextView eml = (TextView) findViewById (R.id.emailView);
        eml.setText(email);
        String tempattLahir = intent.getStringExtra("cikadut");
        TextView tmptlahir = (TextView) findViewById(R.id.tmptlhrView);
        tmptlahir.setText(tempattLahir);
        String tanggallahir = intent.getStringExtra("281298");
        TextView tgllahir = (TextView) findViewById(R.id.tglLhrView);
        tgllahir.setText(tanggallahir);
        String alamat = intent.getStringExtra("Bandung");
        TextView almt = (TextView) findViewById(R.id.almtView);
        almt.setText(alamat);
        String jk = intent.getStringExtra("jenisKelamin");
        TextView jenisK = (TextView) findViewById(R.id.jKView);
        jenisK.setText(jk);
        String Password = intent.getStringExtra("12345");
        TextView pass = (TextView) findViewById(R.id.passView);
        pass.setText(Password);

    }
}
