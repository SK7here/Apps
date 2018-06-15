package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cc1 extends AppCompatActivity {

    int counterA;
    int counterB;
    TextView teamA;
    TextView teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc1);
        teamA = (TextView) findViewById(R.id.textView3);
        teamB = (TextView) findViewById(R.id.textView5);
    }

    /**Following 3 functions increment  counter value of team B accordingly **/

    public void teamA2p(View view){

        counterA = counterA + 2;
        dispA(counterA);
    }

    public void teamA3p(View view){

        counterA = counterA + 3;
        dispA(counterA);
    }

    public void teamAfree(View view){

        counterA = counterA + 1;
        dispA(counterA);
    }

    /**Following 3 functions increment  counter value of team A accordingly **/

    public void teamB2p(View view){

        counterB = counterB + 2;
        dispB(counterB);
    }

    public void teamB3p(View view){

        counterB = counterB + 3;
        dispB(counterB);
    }

    public void teamBfree(View view){

        counterB = counterB + 1;
        dispB(counterB);
    }

    /** Following function resets the scorekeeper **/

    public void gameReset(View view){

        counterA = 0;
        counterB = 0;
        teamA.setText("" + counterA);
        teamB.setText("" + counterB);

    }

    /** Following 2 functions display points of teams **/

    private void dispA(int count){

        teamA.setText("" + count);
    }

    private void dispB(int count){

        teamB.setText("" + count);
    }
}
