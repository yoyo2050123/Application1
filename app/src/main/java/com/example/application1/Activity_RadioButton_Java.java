package com.example.application1;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_RadioButton_Java extends AppCompatActivity {

    TextView textview_answer_q1,textview_answer_q2;

    RadioGroup radiogroup_01, radiogroup_02;

    RadioButton radioButton_01,radioButton_02,radioButton_03,radioButton_04,radioButton_05,radioButton_06;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radio_button_java);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        textview_answer_q1 = findViewById(R.id.textview_answer_q1);
        textview_answer_q2 = findViewById(R.id.textview_answer_q2);

        radiogroup_01 = findViewById(R.id.radiogroup_01);
        radiogroup_02 = findViewById(R.id.radiogroup_02);

        radioButton_01 = findViewById(R.id.radioButton_01);
        radioButton_02 = findViewById(R.id.radioButton_02);
        radioButton_03 = findViewById(R.id.radioButton_03);
        radioButton_04 = findViewById(R.id.radioButton_04);
        radioButton_05 = findViewById(R.id.radioButton_05);
        radioButton_06 = findViewById(R.id.radioButton_06);

        radiogroup_01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selectedId = radiogroup_01.getCheckedRadioButtonId();

                if (selectedId == R.id.radioButton_01){
                    textview_answer_q1.setText("第一題選擇了 : " + radioButton_01.getText().toString());
                } else if (selectedId == R.id.radioButton_02){
                    textview_answer_q1.setText("第一題選擇了 : " + radioButton_02.getText().toString());
                }  else if (selectedId == R.id.radioButton_03){
                    textview_answer_q1.setText("第一題選擇了 : " + radioButton_03.getText().toString());
                }
            }
        });
        radioButton_04.setOnClickListener(radioClickListener);
        radioButton_05.setOnClickListener(radioClickListener);
        radioButton_06.setOnClickListener(radioClickListener);
    }

    View.OnClickListener radioClickListener = new View.OnClickListener(){
        @Override
        public void  onClick(View v){
            int selectid = radiogroup_02.getCheckedRadioButtonId();
            View v1 = findViewById(selectid);
            RadioButton rb1 = (RadioButton) v1;
            textview_answer_q2.setText("第二題選擇了 : " +rb1.getText().toString());
        }
    };

}