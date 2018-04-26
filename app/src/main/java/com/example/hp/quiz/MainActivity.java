package com.example.hp.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       final EditText editName =  findViewById(R.id.editText_name);
       final TextView displayText = findViewById(R.id.textView_name);
       Button showButton = findViewById(R.id.button_show);

       showButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String name = editName.getText().toString();
               displayText.setText(name);

           }
       });
   }
}
