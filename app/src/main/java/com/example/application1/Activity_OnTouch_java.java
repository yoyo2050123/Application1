package com.example.application1;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_OnTouch_java extends AppCompatActivity {

    ImageView imageView_01;
    TextView textview_change_pic,textview_change_scaletype;

    int imageIndex = 0,scaleIndex = 0 , i= 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imageview_java);
   //     ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
   //         Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
   //         v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
   //         return insets;
   //     });
        imageView_01 = findViewById(R.id.imageview_01);
        textview_change_pic = findViewById(R.id.textview_change_pic);
        textview_change_scaletype = findViewById(R.id.textview_change_scaletype);

        textview_change_pic.setText("手勢觸發的動作型態 : ");
        textview_change_scaletype.setText("");

        textview_change_pic.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    textview_change_scaletype.setText("Action Dpwn 動作被觸發");
                } else if  (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    textview_change_scaletype.setText("Action UP 動作被觸發");
                } else if  (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    textview_change_scaletype.setText("Action UP 動作被觸發");
                } else if  (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
                    textview_change_scaletype.setText("Action MOVE 動作被觸發");
                } else{
                    textview_change_scaletype.setText("Action Code  - " +motionEvent.getAction());
                }

                return false;
            }
        });



    }
}