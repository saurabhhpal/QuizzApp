package com.example.pals.basicsgkquizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText editText;
//            , buttonA, buttonB, buttonC, buttonD;
    RadioGroup radioGroup ;
    RadioButton radioButton;
    String showScore = "SHOW SCORE";
    int counter = 0;
    private static final int MAX = 10;
    private static final String LOADING = "loading..";
    String[] qList = new String[]{
            "In which numbering system can the binary number 1011011111000101 be easily converted to?",
            "Which bitwise operator is suitable for turning off a particular bit in a number?",
            "Which bitwise operator is suitable for turning on a particular bit in a number?",
            "Which bitwise operator is suitable for checking whether a particular bit is on or off?",
            "An array of three pointers to chars",
            "What do the following declaration signify?",
            "Declare the following statement?\n" +
                    "\"A pointer to an array of three chars\".",
            "What do the following declaration signify?\n" +
                    "\n" +
                    "char *arr[10];",
            "What do the following declaration signify?\n" +
                    "\n" +
                    "int (*pf)();",

            "Declare the following statement?\n" +
                    "\"A pointer to a function which receives an int pointer and returns float pointer\"."};


    String[] ansList1 = new String[]{"&& operator",
            "& operator",
            "! operator",
            "|| operator"};

    String[] ansList2 = new String[]{
            "char *ptr[3]();",
            "char *ptr[3];",
            "char (*ptr[3])();",
            "char **ptr[3]"
    };

    String[] ansList3 = new String[]{
            "ptr is a pointer to an array of 30 integer pointers.",
            "ptr is a array of 30 pointers to integers.",
            "ptr is a array of 30 integer pointers.",
            "ptr is a array 30 pointers."
    };

    String[] ansList4 = new String[]{
            "char *ptr[3]();",
            "char (*ptr)*[3];",
            "char (*ptr[3])();",
            "char (*ptr)[3];"
    };

    String[] ansList5 = new String[]{
            "arr is a array of 10 character pointers.",
            "arr is a array of function pointer.",
            "arr is a array of characters.",
            "arr is a pointer to array of characters."
    };

    String[] ansList6 = new String[]{
            "pf is a pointer to function.",
            "pf is a function pointer.",
            "pf is a pointer to a function which return int",
            "pf is a function of pointer variable."
    };

    String[] ansList7 = new String[]{
            "float *(ptr)*int;",
            "float *(*ptr)(int)",
            "float *(*ptr)(int*)",
            "floatfl  (*ptr)(int)"
    };

    String[] ansList8 = new String[]{
            "cmp is a pointer to an void type.",
            "cmp is a void type pointer variable",
            "cmp is a function that return a void pointer.",
            "cmp function returns nothing."
    };

    String[] ansList9 = new String[]{
            "void *(ptr)*int;",
            "void *(*ptr)()",
            "void *(*ptr)(*",
            "void (*ptr)()"
    };


    String[] ansList10 = new String[]{
            "f is a pointer variable of function type.",
            "f is a function returning pointer to an int.",
            "f is a function pointer.",
            "f is a simple declaration of pointer variable."
    };



    String[] resultList = new String[]{
            "B",
            "B",
            "D",
            "B",
            "B",
            "B",
            "D",
            "A",
            "C",
            "C"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.nextBt);
        button1.setText("NEXT ");

//        buttonA = findViewById(R.id.but1);
//        buttonB = findViewById(R.id.but2);
//        buttonC = findViewById(R.id.but3);
//        buttonD = findViewById(R.id.but4);

        radioGroup =  findViewById(R.id.select_opt);

        if(counter == MAX-1){
            populate_questions();
            editText = findViewById(R.id.txt_ans);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if( editText.getText().toString().trim().equals("f is a function pointer")){
                       score+=1;
                }
            }
            });
        }else {
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int selectedId = radioGroup.getCheckedRadioButtonId();
                        radioButton = findViewById(selectedId);
//                if(counter == MAX-1){
//                   editText = findViewById(R.id.txt_ans);
//                   if( editText.getText().toString().trim().equals("f is a function pointer")){
////                       score+=1;
//                    }
//                }else {
                        buttonPress(selectedId);
                        populate_questions();
                        pressed = false;
//                }
                    }
                });


//        }
//        else {
//            buttonPress(selectedId);
//            populate_questions();
//            pressed = false;
        }

        populate_questions();

    }

    int showAnswer;

    public  void buttonPress(int  rb) {
            switch (rb) {
                case R.id.opt1:

                    fillColors(R.id.opt1);
                    break;
                case R.id.opt2:

                    fillColors(R.id.opt2);
                    break;
                case R.id.opt3:

                    fillColors(R.id.opt3);
                    break;
                case R.id.opt4:

                    fillColors(R.id.opt4);
                    break;
            }
//        return v.getId();
    }

    int score = 0;
    boolean pressed = false;

    public void fillColors(int buttonId) {
//        Toast.makeText(getApplicationContext(), "INSIDE FILL COLORS " + counter, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(), "Selected button " + (buttonId) + " BUTTON 2 " + R.id.but2, Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(), "Selected button "+R.id.but2, Toast.LENGTH_LONG).show();
        switch (buttonId) {

            case R.id.opt2:
                if (counter == 1 || counter == 2 || counter == 4 || counter == 5 || counter == 6) {
                    score = score + 1;
//                    radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_green_24dp));
//
//                } else {
//                    radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_red_24dp));


                }
                pressed = true;

                radioButton.setChecked(false);
                break;


            case R.id.opt1:
                if (counter == 8) {
                    score = score + 1;
//                    radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_green_24dp));
//                } else {
//                    radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_red_24dp));
                }

                radioButton.setChecked(false);
                pressed = true;
                break;


            case R.id.opt3:

                if (counter == 9 || counter == 10) {
                    score = score + 1;
//                   radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_green_24dp));
//                } else
//                    radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_red_24dp));

                }

                radioButton.setChecked(false);
                pressed = true;

                break;

            case R.id.opt4:
                if (counter == 3 || counter == 7) {
//                    score = score + 1;
//                   radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_green_24dp));
//                } else {
//
//                    radioButton.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_red_24dp));
                }

                radioButton.setChecked(false);

                pressed = true;
                break;

            default:


        }

    }

    private void populate_questions() {
        TextView ques = findViewById(R.id.question);
        TextView tvA = findViewById(R.id.opt1);
        TextView tvB = findViewById(R.id.opt2);
        TextView tvC = findViewById(R.id.opt3);
        TextView tvD = findViewById(R.id.opt4);
//        buttonA.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_black_24dp));
//        buttonB.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_black_24dp));
//        buttonC.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_black_24dp));
//        buttonD.setBackground(getDrawable(R.drawable.ic_radio_button_unchecked_black_24dp));
//        buttonA.setVisibility(View.VISIBLE);
//        buttonB.setVisibility(View.VISIBLE);
//        buttonC.setVisibility(View.VISIBLE);
//        buttonD.setVisibility(View.VISIBLE);
        tvA.setVisibility(View.VISIBLE);
        tvB.setVisibility(View.VISIBLE);
        tvC.setVisibility(View.VISIBLE);
        tvD.setVisibility(View.VISIBLE);

        if(counter == MAX-1){
            tvA.setVisibility(View.INVISIBLE);
            tvB.setVisibility(View.INVISIBLE);
            tvC.setVisibility(View.INVISIBLE);
            tvD.setVisibility(View.INVISIBLE);
            editText.setVisibility(View.VISIBLE);


        }else


        if (counter < MAX) {
            button1.setText("NEXT");
            ques.setTextSize(getResources().getDimension(R.dimen.SmallText));
            ques.setMovementMethod(new ScrollingMovementMethod());
//            textView.setMovementMethod(new ScrollingMovementMethod());
            // Setting the question in Text View
            ques.setText(qList[counter].toString());
            // Setting the respective answers for the question
            switch (counter) {
                case 0:
                    tvA.setText(ansList1[0].toString());

                    tvB.setText(ansList1[1].toString());

                    tvC.setText(ansList1[2].toString());

                    tvD.setText(ansList1[3].toString());

                    break;

                case 1:
                    tvA.setText(ansList1[0].toString());

                    tvB.setText(ansList1[1].toString());

                    tvC.setText(ansList1[2].toString());

                    tvD.setText(ansList1[3].toString());
                    break;

                case 2:
                    tvA.setText(ansList1[0].toString());

                    tvB.setText(ansList1[1].toString());

                    tvC.setText(ansList1[2].toString());

                    tvD.setText(ansList1[3].toString());

                    break;

                case 3:
                    tvA.setText(ansList3[0].toString());

                    tvB.setText(ansList3[1].toString());

                    tvC.setText(ansList3[2].toString());

                    tvD.setText(ansList3[3].toString());

                    break;

                case 4:
                    tvA.setText(ansList4[0].toString());

                    tvB.setText(ansList4[1].toString());

                    tvC.setText(ansList4[2].toString());

                    tvD.setText(ansList4[3].toString());

                    break;

                case 5:
                    tvA.setText(ansList5[0].toString());

                    tvB.setText(ansList5[1].toString());

                    tvC.setText(ansList5[2].toString());

                    tvD.setText(ansList5[3].toString());

                    break;

                case 6:
                    tvA.setText(ansList6[0].toString());

                    tvB.setText(ansList6[1].toString());

                    tvC.setText(ansList6[2].toString());

                    tvD.setText(ansList6[3].toString());

                    break;

                case 7:
                    tvA.setText(ansList7[0].toString());

                    tvB.setText(ansList7[1].toString());

                    tvC.setText(ansList7[2].toString());

                    tvD.setText(ansList7[3].toString());

                    break;

                case 8:
                    tvA.setText(ansList8[0].toString());

                    tvB.setText(ansList8[1].toString());

                    tvC.setText(ansList8[2].toString());

                    tvD.setText(ansList8[3].toString());

                    break;

                case 9:
                    tvA.setText(ansList9[0].toString());

                    tvB.setText(ansList9[1].toString());

                    tvC.setText(ansList9[2].toString());

                    tvD.setText(ansList9[3].toString());

                    break;

                case 10:
                    tvA.setText(ansList10[0].toString());

                    tvB.setText(ansList10[1].toString());

                    tvC.setText(ansList10[2].toString());

                    tvD.setText(ansList10[3].toString());

                    break;

                default:
                    tvA.setText(LOADING);

                    tvB.setText(LOADING);

                    tvC.setText(LOADING);

                    tvD.setText(LOADING);
                    break;
            }


            counter++;


        } else if (counter == MAX) {
            String showResult = "SHOW RESULT";
            button1.setText(showResult);
            counter = 0;
            button1.setText(showScore);
            ques.setText("You scored " + score * 10 + "%");
            ques.setTextSize(getResources().getDimension(R.dimen.LargeText));
//            buttonA.setVisibility(View.GONE);
//            buttonB.setVisibility(View.GONE);
//            buttonC.setVisibility(View.GONE);
//            buttonD.setVisibility(View.GONE);
            findViewById(R.id.opt1).setVisibility(View.GONE);
            findViewById(R.id.opt2).setVisibility(View.GONE);
            findViewById(R.id.opt3).setVisibility(View.GONE);
            findViewById(R.id.opt4).setVisibility(View.GONE);
            findViewById(R.id.txt_ans).setVisibility(View.INVISIBLE);
            button1.setText("START AGAIN");
            score=0;
//            button1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(this , QuizSelectionActivity.this);
//                    startActivity(intent);
//                }
//            });



        }

    }


}