package com.blogspot.achmadsyarifhidayatullah.androidkejar3;

import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvScoreA;
    TextView tvScoreB;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
        tvScoreA = findViewById(R.id.number);
        tvScoreB = findViewById(R.id.number2);
    }

    public int addThreePoints(int score){
        return score + 3;
    }

    public int addTwoPoints(int score){
        return score + 2;
    }

    public int addFreeThrow(int score){
        return score + 1;
    }

    public void resetAllScore(){
        scoreTeamA = 0;
        scoreTeamB = 0;
        tvScoreA.setText(String.valueOf(scoreTeamA));
        tvScoreB.setText(String.valueOf(scoreTeamB));
    }

    public void displayScoreA(String scoreA){
        tvScoreA.setText(scoreA);
    }

    public void displayScoreB(String scoreB){
        tvScoreB.setText(scoreB);
    }

    private void showToast(){
        Toast.makeText(this, "halo", Toast.LENGTH_SHORT).show();
    }

    public void threePointsA(View view) {
        scoreTeamA = addThreePoints(scoreTeamA);;
        displayScoreA(String.valueOf(scoreTeamA));
    }

    public void twoPointsA(View view){
        scoreTeamA = addTwoPoints(scoreTeamA);
        displayScoreA(String.valueOf(scoreTeamA));

    }

    public void freeThrowA(View view) {
        scoreTeamA = addFreeThrow(scoreTeamA);
        displayScoreA(String.valueOf(scoreTeamA));
    }

    public void threePointsB(View view) {
        scoreTeamB = addThreePoints(scoreTeamB);
        displayScoreB(String.valueOf(scoreTeamB));
    }

    public void twoPointsB(View view){
        scoreTeamB = addTwoPoints(scoreTeamB);
        displayScoreB(String.valueOf(scoreTeamB));
    }

    public void freeThrowB(View view) {
        scoreTeamB = addFreeThrow(scoreTeamB);
        displayScoreB(String.valueOf(scoreTeamB));
    }

    public void reset(View view){
        resetAllScore();
    }

    public void kirimBang(View view) {
        //membuat objek intent
        Intent intentKirim = new Intent(this, DetailActivity.class);
        // memberikan nilai untuk dikirim ke activity yg dituju
        intentKirim.putExtra("SCOREA", scoreTeamA);
        intentKirim.putExtra("SCOREB", scoreTeamB);
        //mengeksekusi intent
        startActivity(intentKirim);
    }
}
