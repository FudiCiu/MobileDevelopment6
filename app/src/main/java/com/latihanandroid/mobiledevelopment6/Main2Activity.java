package com.latihanandroid.mobiledevelopment6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void kembali(View view) {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
