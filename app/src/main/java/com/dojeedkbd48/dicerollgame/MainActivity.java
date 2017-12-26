package com.dojeedkbd48.dicerollgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image1;

    public void roll(View v){
        Random rand = new Random();
        int val = rand.nextInt(6)+1;

        if(val == 1 )
            image1.setImageResource(R.drawable.dice1);
        else if (val == 2 )
            image1.setImageResource(R.drawable.dice2);
        else if (val == 3 )
            image1.setImageResource(R.drawable.dice3);
        else if (val == 4 )
            image1.setImageResource(R.drawable.dice4);
        else if (val == 5 )
            image1.setImageResource(R.drawable.dice5);
        else if (val == 6 )
            image1.setImageResource(R.drawable.dice6);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView)findViewById(R.id.imageView1);
    }
}
