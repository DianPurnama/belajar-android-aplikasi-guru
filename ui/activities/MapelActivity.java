package com.example.dian.aplikasiguru.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dian.aplikasiguru.R;

public class MapelActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNama, txtKeterangan;
    private Button btnSimpan, btnKembali;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapel);

        txtKeterangan = findViewById(R.id.txt_keterangan);
        txtNama = findViewById(R.id.txt_nama);
        btnSimpan = findViewById(R.id.btn_simpan);
        btnKembali = findViewById(R.id.btn_kembali);

        txtKeterangan.setOnClickListener(this);
        txtNama.setOnClickListener(this);
        btnSimpan.setOnClickListener(this);
        btnKembali.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_kembali:
                Intent intent = new Intent(MapelActivity.this, MenuActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
