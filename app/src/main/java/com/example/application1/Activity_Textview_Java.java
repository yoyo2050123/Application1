package com.example.application1;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Textview_Java extends AppCompatActivity {

    TextView textView_01, textView_02, textView_03;
    String strText1;
    int colorText2;
    float sizeText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_textview_java);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
          //  Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //return insets;
        //});
        textView_01 = findViewById(R.id.textview_01);
        textView_02 = findViewById(R.id.textview_02);
        textView_03 = findViewById(R.id.textview_03);

        strText1 = textView_01.getText().toString();
        colorText2 =textView_02.getCurrentTextColor();
        sizeText3 = textView_03.getTextSize();
        sizeText3 = textView_03.getTextSize() /getResources().getDisplayMetrics().scaledDensity;

        textView_01.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus == true){
                    textView_01.setText("TextView1 獲得焦點");
                }
                else{
                    textView_01.setText(strText1);
                }
            }
        });
        textView_02.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    textView_02.setTextColor(0xff0000ff);
                    textView_02.setText("TextView2 獲得焦點");
                }
                else{
                    textView_02.setTextColor(colorText2);
                    textView_02.setText("顯示文字:TextView2");
                }
            }
        });
        textView_03.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    textView_03.setTextSize(30f);
                    textView_03.setText("TextView3 獲得焦點");
                }
                else{
                    textView_03.setTextSize(TypedValue.COMPLEX_UNIT_SP,sizeText3);
                    textView_03.setText("顯示文字:TextView3");
                }
            }
        });

    }
}