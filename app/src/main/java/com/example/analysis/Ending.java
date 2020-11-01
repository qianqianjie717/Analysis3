package com.example.analysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Ending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        Intent intent=getIntent();
        TextView zj=(TextView) findViewById(R.id.text1);
        String a=intent.getStringExtra("M");
        Log.d("Ending",a);
        if (a.equals("A")){
            zj.setText("你很棒！综合成绩很优秀,保持下去啊");
        }
       else if (a.equals("B")){
            zj.setText("加油啊，你会更好的！");
        }
         else if(a.equals("C")){
            zj.setText("同学，上升空间还很大啊！");
        }
         else if(a.equals("D")){
            zj.setText("距离挂科就差一步了，别松懈，要加油啊！");
        }
        else {
            zj.setText("置之死地而后生，你一定可以的，挂科，不存在的");
        }
    }
}




