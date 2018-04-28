package com.example.hp.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup1;
    RadioButton radioButton1;
    int score=0;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       final EditText editName =  findViewById(R.id.editText_name);
       final TextView displayText = findViewById(R.id.textView_name);
       radioGroup1 = findViewById(R.id.radioGroup_Q1);
       Button showButton = findViewById(R.id.button_show);

       showButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String name = editName.getText().toString();
               //radio button
               int selectedId=radioGroup1.getCheckedRadioButtonId();
               radioButton1=findViewById(R.id.radioButton_Q1_op1);
               //if statement for radio button
               if (selectedId==R.id.radioButton_Q1_op2) {
                    score +=1;
               }
               String hell ="Thanks"+name+"your score is"+score;
               //display value on screen
               displayText.setText(hell);
           }
       });
   }
}
