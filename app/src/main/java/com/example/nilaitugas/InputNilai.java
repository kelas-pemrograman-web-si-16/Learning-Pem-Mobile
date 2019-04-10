package com.example.nilaitugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InputNilai extends AppCompatActivity {

    @BindView(R.id.edNpm)
    EditText edNpm;
    @BindView(R.id.edNama)
    EditText edNama;
    @BindView(R.id.edTugas)
    EditText edTugas;
    @BindView(R.id.edQuis)
    EditText edQuis;
    @BindView(R.id.edUts)
    EditText edUts;
    @BindView(R.id.edUas)
    EditText edUas;

    String strNpm, strNama;
    double dblTugas, dblQuis, dblUts, dblUas, dblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nilai);
        ButterKnife.bind(this);

        Intent getData = getIntent();
        strNpm = getData.getStringExtra("npm");
        strNama= getData.getStringExtra("nama");

        edNpm.setText(strNpm);
        edNama.setText(strNama);
    }

    @OnClick(R.id.btnHitung)
    void btnHitung(){
        dblTugas = Double.parseDouble(edTugas.getText().toString());
        dblQuis  = Double.parseDouble(edQuis.getText().toString());
        dblUts   = Double.parseDouble(edUts.getText().toString());
        dblUas   = Double.parseDouble(edUas.getText().toString());

        dblHasil = (dblTugas + dblQuis + dblUts + dblUas) / 4;

        //Toast.makeText(getApplicationContext(), String.valueOf(dblHasil),
        //        Toast.LENGTH_LONG).show();
        Intent a = new Intent(InputNilai.this, Hasil.class);
        a.putExtra("nama", strNama);
        a.putExtra("npm", strNpm);
        a.putExtra("nilai", String.valueOf(dblHasil));
        startActivity(a);
        finish();
    }
}
