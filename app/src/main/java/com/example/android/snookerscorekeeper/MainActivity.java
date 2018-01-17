package com.example.android.snookerscorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Reset the score for both teams back to 0.
     */

    public void resetScore (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA (scoreTeamA);
        displayForTeamB (scoreTeamB);
    }

    public void sendMessage(View view)
    {
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        startActivity(intent);
    }


    public void addSevenForTeamA (View view) {
//        EditText Player1_name = (EditText) findViewById(R.id.player1_name);
//        String name1 = Player1_name.getText().toString();
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA (scoreTeamA);
    }
    public void addSixForTeamA (View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA (scoreTeamA);
        Toast.makeText(this, "Player1 +6 points", Toast.LENGTH_SHORT);
    }
    public void addFiveForTeamA (View view) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA (scoreTeamA);
    }
    public void addFourForTeamA (View view) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA (scoreTeamA);
    }
    public void addThreeForTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA (scoreTeamA);
    }
    public void addTwoForTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA (scoreTeamA);
    }
    public void addOneForTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }
    public void FoulForTeamA (View view) {
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSevenForTeamB (View view) {
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB (scoreTeamB);
    }
    public void addSixForTeamB (View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB (scoreTeamB);
    }
    public void addFiveForTeamB (View view) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB (scoreTeamB);
    }
    public void addFourForTeamB (View view) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB (scoreTeamB);
    }
    public void addThreeForTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB (scoreTeamB);
    }
    public void addTwoForTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB (scoreTeamB);
    }
    public void addOneForTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    public void FoulForTeamB (View view) {
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB (scoreTeamB);
    }



    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
