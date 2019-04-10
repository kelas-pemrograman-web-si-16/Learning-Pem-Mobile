package com.example.nilaitugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Hasil extends AppCompatActivity {

    @BindView(R.id.txtNpm)
    TextView txtNpm;
    @BindView(R.id.txtNama)
    TextView txtNama;
    @BindView(R.id.txtNilai)
    TextView txtNilai;
    @BindView(R.id.txtGrade)
    TextView txtGrade;

    String strNpm, strNama, strNilai, strGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        ButterKnife.bind(this);

        Intent getData = getIntent();
        strNpm = getData.getStringExtra("npm");
        strNama = getData.getStringExtra("nama");
        strNilai = getData.getStringExtra("nilai");

        txtNpm.setText(strNpm);
        txtNama.setText(strNama);
        txtNilai.setText(strNilai);

    }
}
