package com.example.dian.aplikasiguru.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dian.aplikasiguru.R;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMapel, btnGuru, btnSiswa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnGuru = findViewById(R.id.btn_guru);
        btnMapel = findViewById(R.id.btn_mata_pelajaran);
        btnSiswa = findViewById(R.id.btn_siswa);

        btnGuru.setOnClickListener(this);
        btnSiswa.setOnClickListener(this);
        btnMapel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_mata_pelajaran:
                Intent intent = new Intent(MenuActivity.this, MapelActivity.class);
                Toast.makeText(getApplicationContext(), "mamamam", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case R.id.btn_guru:
                Intent intent1 = new Intent(MenuActivity.this, GuruActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_siswa:
                Intent intent2 = new Intent(MenuActivity.this, SiswaActivity.class);
                startActivity(intent2);
                break;
            default:
                break;

        }
    }
}
