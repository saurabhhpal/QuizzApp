package com.example.pals.basicsgkquizzapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizSelectionActivity extends Activity{
    Button gk_quiz_bt , others_bt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_type_seletion);
        gk_quiz_bt = findViewById(R.id.gk_quiz_Bt);
        others_bt = findViewById(R.id.others_quiz_Bt);

        gk_quiz_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gk_intent_intent = new Intent(getApplicationContext() , MainActivity.class);
                startActivity(gk_intent_intent);
            }
        });

        others_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , "MORE QUIZZES COMING SOON",Toast.LENGTH_LONG).show();
            }
        });

    }
}
