package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int numbertobeguessed;
    public void randomnumbergenerator(){
        Random rand = new Random();
        numbertobeguessed= rand.nextInt(20)+1;
    }


    public void guess(View view){
        EditText userGuess= (EditText)findViewById(R.id.userGuess);

        String guessednumber= userGuess.getText().toString();
        int numberbyuser= Integer.parseInt(guessednumber);
        String message = null;
        if(numberbyuser>numbertobeguessed){
            message= "lower!!";

        }else if (numberbyuser<numbertobeguessed){
            message= "higher";

        }else if (numberbyuser==numbertobeguessed){
            message= "You guessed it right!!!!!!   Play again";
                randomnumbergenerator();
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomnumbergenerator();
    }
}