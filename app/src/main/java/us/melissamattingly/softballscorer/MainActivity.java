package us.melissamattingly.softballscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int ballsTeamA = 0;
    int strikesTeamA = 0;
    int outsTeamA = 0;
    int scoreTeamB = 0;
    int ballsTeamB = 0;
    int strikesTeamB = 0;
    int outsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the count for Team A.
     */
    public void displayCountForTeamA() {
        TextView countView = findViewById(R.id.team_a_count);
        countView.setText(String.valueOf(ballsTeamA) + " - " + String.valueOf(strikesTeamA));
    }

    /**
     * Adds 1 run for Team A.
     */
    public void addRun(View view) {
        scoreTeamA++;
        displayRuns();
    }

    /**
     * Displays the runs for Team A.
     */
    public void displayRuns() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Adds 1 ball for Team A.
     */
    public void addBall(View view) {
        if (ballsTeamA < 3) {
            ballsTeamA++;
            displayCountForTeamA();
        }
    }

    /**
     * Adds 1 strike for Team A.
     */
    public void addStrike(View view) {
        if (strikesTeamA < 2) {
            strikesTeamA++;
            displayCountForTeamA();
        }
    }

    /**
     * Adds 1 out for Team A.
     */
    public void addOut(View view) {
        if (outsTeamA == 3) {
            outsTeamA = 0;
        } else {
            outsTeamA++;
        }

        displayOuts();
    }

    /**
     * Displays the outs for Team A.
     */
    public void displayOuts() {
        TextView outsView = (TextView) findViewById(R.id.team_a_outs);
        outsView.setText(String.valueOf(outsTeamA));
    }

    /**
     * Resets the counts to 0 - 0 for Team A.
     */
    public void resetCount(View view) {
        ballsTeamA = 0;
        strikesTeamA = 0;
        displayCountForTeamA();
    }

    /**
     * Displays the count for Team B.
     */
    public void displayCountForTeamB() {
        TextView countView = findViewById(R.id.team_b_count);
        countView.setText(String.valueOf(ballsTeamB) + " - " + String.valueOf(strikesTeamB));
    }

    /**
     * Adds 1 run for Team B.
     */
    public void addRunB(View view) {
        scoreTeamB++;
        displayRunsB();
    }

    /**
     * Displays the runs for Team B.
     */
    public void displayRunsB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Adds 1 ball for Team B.
     */
    public void addBallB(View view) {
        if (ballsTeamB < 3) {
            ballsTeamB++;
            displayCountForTeamB();
        }
    }

    /**
     * Adds 1 strike for Team B.
     */
    public void addStrikeB(View view) {
        if (strikesTeamB < 2) {
            strikesTeamB++;
            displayCountForTeamB();
        }
    }

    /**
     * Adds 1 out for Team B.
     */
    public void addOutB(View view) {
        if (outsTeamB == 3) {
            outsTeamB = 0;
        } else {
            outsTeamB++;
        }

        displayOutsB();
    }

    /**
     * Displays the outs for Team B.
     */
    public void displayOutsB() {
        TextView outsView = (TextView) findViewById(R.id.team_b_outs);
        outsView.setText(String.valueOf(outsTeamB));
    }

    /**
     * Resets the counts to 0 - 0 for Team B.
     */
    public void resetCountB(View view) {
        ballsTeamB = 0;
        strikesTeamB = 0;
        displayCountForTeamB();
    }

    /**
     * Resets the app to 0 for all states.
     */
    public void reset(View view) {
        resetCount(view);
        resetCountB(view);

        outsTeamA = 0;
        displayOuts();

        outsTeamB = 0;
        displayOutsB();

        scoreTeamA = 0;
        displayRuns();

        scoreTeamB = 0;
        displayRunsB();
    }
}
