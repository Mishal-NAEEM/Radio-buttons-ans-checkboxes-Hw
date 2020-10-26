package com.example.radio_buttons_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup Radio_Group1,Radio_Group2;
    RadioButton radiobutton1,radiobutton2;

    TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radio_Group1=findViewById(R.id.radiogroup1);
        Radio_Group2=findViewById(R.id.radiogroup2);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);

    }

    public void onButtonClick(View view) {

        int checked1=Radio_Group1.getCheckedRadioButtonId();
        radiobutton1=findViewById(checked1);
        text1.setText(radiobutton1.getText());

        int checked2=Radio_Group2.getCheckedRadioButtonId();
        radiobutton2=findViewById(checked2);

        text2.setText(radiobutton2.getText());


    }
}