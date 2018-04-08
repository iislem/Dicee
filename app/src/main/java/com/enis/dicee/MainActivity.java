package com.enis.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton= (Button) findViewById(R.id.rollbutton);

        final ImageView left_dice = (ImageView) findViewById(R.id.left_dice);

        final ImageView right_dice = (ImageView) findViewById(R.id.right_dice);

        final int[] DiceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random DiceRandomNumber = new Random();
                int number1 = DiceRandomNumber.nextInt(6);
                int number2 = DiceRandomNumber.nextInt(6);
                left_dice.setImageResource(DiceArray[number1]);
                right_dice.setImageResource(DiceArray[number2]);
                Log.d("Dicee", "DiceRandomNumber is "+ number1);
                Log.d("Dicee", "DiceRandomNumber is "+ number2);

            }
        });

    }
}
