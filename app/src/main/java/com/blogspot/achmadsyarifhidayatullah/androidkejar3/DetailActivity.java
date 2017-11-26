package com.blogspot.achmadsyarifhidayatullah.androidkejar3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvScoreA, tvScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String kalimatA = "Nilai Team A adalah ";
        String kalimatB = "Nilai Team B adalah ";

        tvScoreA = findViewById(R.id.scorea);
        tvScoreB = findViewById(R.id.scoreb);

        Intent intentTerima = getIntent();
        int a = intentTerima.getIntExtra("SCOREA", 0);
        int b = intentTerima.getIntExtra("SCOREB", 0);

        tvScoreA.setText(kalimatA+a);
        tvScoreB.setText(kalimatB+b);
    }
}
