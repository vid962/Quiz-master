package com.example.android.quiz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int totalPoints = 0;
    int incorrectAnswers=0;
    //Checking first answer, RadioGroup (Wellington)
        public void RadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();
            RadioButton buttonB_Q1 = findViewById(R.id.buttonB_Q1);
            if (buttonB_Q1.isChecked()) {
                totalPoints=totalPoints+10;
            } else {
                incorrectAnswers=incorrectAnswers+1;
            }
        }
    //Checking second answer, RadioGroup (Mt Cook)
    public void RadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton buttonD_Q2 = findViewById(R.id.buttonD_Q2);

        if (buttonD_Q2.isChecked()) {
            totalPoints=totalPoints+10;
        } else {
            incorrectAnswers=incorrectAnswers+1;
        }
    }
    //Checking fifth answer, RadioGroup (4mln)
    public void RadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton buttonB_Q5 = findViewById(R.id.buttonB_Q5);
        if (buttonB_Q5.isChecked()) {
            totalPoints=totalPoints+10;
        } else {
           incorrectAnswers=incorrectAnswers+1;
        }
    }
    //Checking third answer, CheckBoxes
    public void CheckBoxClicked(View view) {
        // Is the checkbox now checked?
        CheckBox checkBoxA = findViewById(R.id.checkbox_a_Q3);
        boolean hasCheckedA = checkBoxA.isChecked();
        CheckBox checkBoxB = findViewById(R.id.checkbox_b_Q3);
        boolean hasCheckedB = checkBoxB.isChecked();
        CheckBox checkBoxC = findViewById(R.id.checkbox_c_Q3);
        boolean hasCheckedC = checkBoxC.isChecked();
        CheckBox checkBoxD = findViewById(R.id.checkbox_d_Q3);
        boolean hasCheckedD = checkBoxD.isChecked();
        if ((hasCheckedB)&&(hasCheckedD)) {
            totalPoints=totalPoints+10;
        }
        else {
            incorrectAnswers=incorrectAnswers+1;
        }
    }
//Checking  EditText
    public void checkEditText() {
        EditText editTextAnswer = findViewById(R.id.editText_answer_Q4);
        String passedAnswer = editTextAnswer.getText().toString().trim();
        String correctAnswer = "two";
        if (passedAnswer.equals(correctAnswer)) {
            totalPoints=totalPoints+10;
        }
        else {
            incorrectAnswers=incorrectAnswers+1;
        }
    }
    public void submit(View view) {
        checkEditText();
            // This is a toast message
            Toast.makeText(this, "Thank you " + "\nYour points: " + totalPoints + "/50" +
                    "\nIncorrect answers:" + incorrectAnswers, Toast.LENGTH_LONG).show();
        // disable  the ability to click it again
        final Button choice1 = (Button) findViewById(R.id.submit_button);
        choice1.setClickable(false);
    }
}
