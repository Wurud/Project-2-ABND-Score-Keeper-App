package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Add six points for Team A
    public void addSixForTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    //Add six points for Team B
    public void addSixForTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    //Add three points for Team A
    public void addThreeForTeamA(View view) {

        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    //Add three points for Team B
    public void addThreeForTeamB(View view) {

        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    //Add two points for Team A
    public void addTwoForTeamA(View view) {

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //Add two points for Team B
    public void addTwoForTeamB(View view) {

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    //Add one point for Team A
    public void addOneForTeamA(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    //Add one point for Team B
    public void addOneForTeamB(View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    //Rest the game
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

}
