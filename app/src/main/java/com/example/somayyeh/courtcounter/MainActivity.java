package com.example.somayyeh.courtcounter;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreA=0;
    private int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View backgroundimage = findViewById(R.id.backlayout);
        Drawable background = backgroundimage.getBackground();
        background.setAlpha(170);

    }
    public void onClickAction(View view)
    {
        switch(view.getId())
        {
            case R.id.oneA:
                scoreA++;
                break;
            case R.id.oneB:
                scoreB++;
                break;
            case R.id.twoA:
                scoreA+=2;
                break;
            case R.id.twoB:
                scoreB+=2;
                break;
            case R.id.threeA:
                scoreA+=3;
                break;
            case R.id.threeB:
                scoreB+=3;
                break;
            case R.id.reset:
                scoreA=0;
                scoreB=0;
                break;
            default:
                throw new RuntimeException("Unknow button ID");
        }
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        System.out.println("test");

    }
    public void displayScoreA(int sA)
    {
       TextView score = (TextView)findViewById(R.id.scoreA) ;
        score.setText(""+sA);
    }
    public void displayScoreB(int sB)
    {
            TextView score = (TextView) findViewById(R.id.scoreB);
            score.setText(""+sB);

    }

}
