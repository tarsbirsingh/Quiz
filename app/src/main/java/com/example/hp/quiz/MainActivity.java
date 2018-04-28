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
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    //RadioButton Define here with numeric series
    RadioButton radioButton1;
    RadioButton radioButton2;
    int score=0;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       //with id
       final EditText editName =  findViewById(R.id.editText_name);
       final TextView displayText = findViewById(R.id.textView_name);
       radioGroup1 = findViewById(R.id.radioGroup_Q1);
       radioGroup2 = findViewById(R.id.radioGroup_Q2);
       Button showButton = findViewById(R.id.button_show);
       showButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String name = editName.getText().toString();
               //radio button
               int selectedId1=radioGroup1.getCheckedRadioButtonId();
               radioButton1=findViewById(R.id.radioButton_Q1_op1);
               int selectedId2=radioGroup1.getCheckedRadioButtonId();
               radioButton2=findViewById(R.id.radioButton_Q2_op1);
               //if statement for radio button
               if (selectedId1==R.id.radioButton_Q1_op1) {
                    score +=1;
               }
               else if (selectedId2==R.id.radioButton_Q2_op4) {
                   score +=1;
               }
               String hell ="Thanks"+name+"your score is"+score;
               //display value on screen
               displayText.setText(hell);
           }
       });
   }
}
