package com.example.dian.aplikasiguru.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dian.aplikasiguru.R;

public class GuruActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNip, txtNamaGuru, txtAlamatGuru;
    private Button btnKembali1, btnSimpan1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru);

        txtNip = findViewById(R.id.txt_nip);
        txtNamaGuru = findViewById(R.id.txt_nama_guru);
        txtAlamatGuru = findViewById(R.id.txt_alamat_guru);

        btnSimpan1 = findViewById(R.id.btn_simpan1);
        btnKembali1 = findViewById(R.id.btn_kembali1);

        txtNip.setOnClickListener(this);
        txtAlamatGuru.setOnClickListener(this);
        txtNamaGuru.setOnClickListener(this);

        btnKembali1.setOnClickListener(this);
        btnSimpan1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_kembali1:
                Intent intent = new Intent(GuruActivity.this, MenuActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
