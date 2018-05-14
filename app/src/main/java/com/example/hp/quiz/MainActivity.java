package com.example.hp.quiz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;
    /**Radio Group*/
   RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    // Checkbox Group
    CheckBox checkBox1;
    //CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    //Edit Text
    EditText editText1;
    EditText editText2;

    /**
     *  RadioButton Define here with numeric series
     */

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton7;
    RadioButton radioButton8;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       //with id
       final EditText editName =  findViewById(R.id.editText_name);
       final TextView displayText = findViewById(R.id.textView_name);
       //Radio Group
       radioGroup1 = findViewById(R.id.radioGroup_Q1);
       radioGroup2 = findViewById(R.id.radioGroup_Q2);
       radioGroup3 = findViewById(R.id.radioGroup_Q3);
       radioGroup4 = findViewById(R.id.radioGroup_Q4);
       radioGroup5 = findViewById(R.id.radioGroup_Q5);
       radioGroup7 = findViewById(R.id.radioGroup_Q7);
       radioGroup8 = findViewById(R.id.radioGroup_Q8);
       //Checkbox here
       checkBox1=findViewById(R.id.checkbox_Q6_op1);
       checkBox3=findViewById(R.id.checkbox_Q6_op3);
       checkBox4=findViewById(R.id.checkbox_Q6_op4);
       editText1=findViewById(R.id.Q9_ans_view);
       editText2=findViewById(R.id.Q10_ans_view);

       Button showButton = findViewById(R.id.button_show);
       showButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String name = editName.getText().toString();
               //radio button for FIRST QUESTION
               int selectedId1=radioGroup1.getCheckedRadioButtonId();
               int selectedId2=radioGroup2.getCheckedRadioButtonId();
               int selectedId3=radioGroup3.getCheckedRadioButtonId();
               int selectedId4=radioGroup4.getCheckedRadioButtonId();
               int selectedId5=radioGroup5.getCheckedRadioButtonId();
               int selectedId7=radioGroup7.getCheckedRadioButtonId();
               int selectedId8=radioGroup8.getCheckedRadioButtonId();
               radioButton1=findViewById(selectedId1);
               radioButton2=findViewById(selectedId2);
               radioButton3=findViewById(selectedId3);
               radioButton4=findViewById(selectedId4);
               radioButton5=findViewById(selectedId5);
               radioButton7=findViewById(selectedId7);
               radioButton8=findViewById(selectedId8);
               //if statement for radio button
               if (selectedId1==R.id.radioButton_Q1_op1) {
                   score =score+1;
               }
               else if (selectedId2==R.id.radioButton_Q2_op4) {
                   score =score+1;
               }
               else if (selectedId3==R.id.radioButton_Q3_op4){
                   score =score+1;
               }
               else if (selectedId4==R.id.radioButton_Q4_op2) {
                   score =score+1;
               }
               else if (selectedId5==R.id.radioButton_Q5_op1) {
                   score =score+1;
               }
               else if (selectedId7==R.id.radioButton_Q7_op4){
                   score =score+1;
               }
               else if (selectedId8==R.id.radioButton_Q8_op4) {
                   score =score+1;
               }
               String hell ="Thanks "+name+"your score is"+score;
               //display value on screen
               displayText.setText(hell);
           }
       });
   }
}
