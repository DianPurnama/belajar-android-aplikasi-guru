package com.example.dian.aplikasiguru.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dian.aplikasiguru.R;

public class SiswaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNis, txtNamaSiswa;
    private Button btnKembali2, btnSimpan2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);

        txtNis = findViewById(R.id.txt_nis);
        txtNamaSiswa = findViewById(R.id.txt_nama_siswa);

        btnKembali2 = findViewById(R.id.btn_kembali2);
        btnSimpan2 = findViewById(R.id.btn_simpan2);

        txtNis.setOnClickListener(this);
        txtNamaSiswa.setOnClickListener(this);

        btnSimpan2.setOnClickListener(this);
        btnKembali2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_kembali2:
                Intent intent = new Intent(SiswaActivity.this, MenuActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
