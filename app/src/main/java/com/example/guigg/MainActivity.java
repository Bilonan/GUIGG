package com.example.guigg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    TextView tv;
    EditText et;
    int num,
        count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) this.findViewById(R.id.btn_guess);
        b2 = (Button) this.findViewById(R.id.btn_secret);
        tv = (TextView) this.findViewById(R.id.infoBox);
        et = (EditText) this.findViewById(R.id.inputBox);


        View.OnClickListener button1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Меняем текст в TextView (tvOut)
                int guess = Integer.parseInt(et.getText().toString());
                et.setText("");
                if (guess == num) {
                    tv.append("\nCongratulations, " + num + " was the right guess!");
                    tv.append("\nYou used " + count + " guesses.");
                }
                else if (guess < num) { tv.append("\nhigher"); }
                else { tv.append("\nlower"); }
                count ++;
                if (count == 11 && guess != num) {
                    tv.append("\nYou have lost the game, the secret number was " + num + ".");
                }
            }
        };
        b1.setOnClickListener(button1);

        View.OnClickListener button2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Меняем текст в TextView (tvOut)
                tv.setText("Enter a number between 0 and 500 (-1 if you want me to choose one).");
                num = Integer.parseInt(et.getText().toString());
                et.setText("");
                if (num == -1) { num = (int) (Math.random()*500); }

                count = 1;
            }
        };
        b2.setOnClickListener(button2);
    }

}

