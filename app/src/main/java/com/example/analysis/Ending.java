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
        TextView wd=(TextView) findViewById(R.id.text2);
        TextView hh=(TextView) findViewById(R.id.text3);
        String a=intent.getStringExtra("M");
        String b=intent.getStringExtra("N");
        double c=Double.valueOf(b);
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
        if(c>=0&&c<=0.9999){
            wd.setText("你的成绩稳如泰山，考试千万次，稳定是首要，千万不要松懈");
        }
        else if(c>=1&&c<=3.9999){
            wd.setText("你和学霸就差一道未解的数学题，想要弯道超车，快努力吧");
        }
        else if(c>=4&&c<=9.9999){
            wd.setText("你的成绩有一点不稳定哦，我猜你有点偏科，要加油");
        }
        else{
            wd.setText("你的成绩就像过山车一样，你这个司机不称职啊，要加把劲啊");
        }
        hh.setText("每日一问，今年的学分修满了吗");
    }
}




