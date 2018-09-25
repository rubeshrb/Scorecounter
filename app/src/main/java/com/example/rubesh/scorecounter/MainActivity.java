package com.example.rubesh.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PASTE CODE YOU WANT TO TEST HERE
    }


    /**
     * Displays the given score for Team A.
     */

    public void CountScorea(View view)

    {
        ScoreTeamA = ScoreTeamA+3;

        displayForTeamA(ScoreTeamA);





    }
    public void CountScoreb(View view)

    {
        ScoreTeamA = ScoreTeamA+2;

        displayForTeamA(ScoreTeamA);




    }

    public void CountScorec(View view)

    {
        ScoreTeamA = ScoreTeamA+1;

        displayForTeamA(ScoreTeamA);
    }


    public void CountScored(View view)

    {
        ScoreTeamB = ScoreTeamB+3;

        displayForTeamB(ScoreTeamB);

    }

    public void CountScoree(View view)

    {
        ScoreTeamB = ScoreTeamB+2;

        displayForTeamB(ScoreTeamB);

    }

    public void CountScoref(View view)

    {
        ScoreTeamB = ScoreTeamB+1;

        displayForTeamB(ScoreTeamB);

    }

    public void reset(View view)

    {
        ScoreTeamB = 0 ;
        displayForTeamB(ScoreTeamB);

        ScoreTeamA = 0 ;
        displayForTeamA(ScoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    }
