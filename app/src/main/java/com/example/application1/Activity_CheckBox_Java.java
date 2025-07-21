package com.example.application1;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_CheckBox_Java extends AppCompatActivity {

    CheckBox checkBox_answer_01,checkBox_answer_02,checkBox_answer_03,checkBox_answer_04;

    String strTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_check_box_java);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        checkBox_answer_01 = findViewById(R.id.checkbox_answer_01);
        checkBox_answer_02 = findViewById(R.id.checkbox_answer_02);
        checkBox_answer_03 = findViewById(R.id.checkbox_answer_03);
        checkBox_answer_04 = findViewById(R.id.checkbox_answer_04);


        checkBox_answer_01.setOnCheckedChangeListener(checkedChangeListener_01);
        checkBox_answer_02.setOnCheckedChangeListener(checkedChangeListener_01);
        checkBox_answer_03.setOnCheckedChangeListener(checkedChangeListener_01);
        checkBox_answer_04.setOnCheckedChangeListener(checkedChangeListener_01);
    }
    CompoundButton.OnCheckedChangeListener checkedChangeListener_01 = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            strTemp = "已選擇 :";
            if (checkBox_answer_01.isChecked()){
                strTemp += checkBox_answer_01.getText().toString() + " , ";
            }
            if (checkBox_answer_02.isChecked()){
                strTemp += checkBox_answer_02.getText().toString() + " , ";
            }
            if (checkBox_answer_03.isChecked()){
                strTemp += checkBox_answer_03.getText().toString() + " , ";
            }
            if (checkBox_answer_04.isChecked()){
                strTemp += checkBox_answer_04.getText().toString();
            }
            Toast t = Toast.makeText(Activity_CheckBox_Java.this,strTemp,Toast.LENGTH_SHORT);
            t.show();
        }



    };





}