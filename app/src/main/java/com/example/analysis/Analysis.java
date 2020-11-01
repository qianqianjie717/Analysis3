package com.example.analysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Analysis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        final Intent intent=getIntent();
        TextView Zhcj=(TextView) findViewById(R.id.textView);
        TextView Zxf=(TextView) findViewById(R.id.textView2);
        TextView Jqpjf=(TextView) findViewById(R.id.textView3);
        TextView Jd=(TextView) findViewById(R.id.textView4);
        TextView Zhdj=(TextView) findViewById(R.id.textView5);
        String str=intent.getStringExtra("zxf");
        String str2=intent.getStringExtra("zhcj");
        String str3=intent.getStringExtra("jd");
        String str4=intent.getStringExtra("jqpjf");
//        String str5=intent.getStringExtra("zhdj");
        java.text.DecimalFormat f=new java.text.DecimalFormat("#.##");
     /*Zhcj.setText(f.format(str2));
        Zxf.setText(str);
        Jd.setText(str3);
        Jqpjf.setText(str4);*/
        double a;
        a=Double.valueOf(str);
        final double b;
        b=Double.valueOf(str2);
        double c;
        c=Double.valueOf(str3);
        double d;
        d=Double.valueOf(str4);
        Zhcj.setText(f.format(a));
        Zxf.setText(f.format(b));
        Jd.setText(f.format(c));
        Jqpjf.setText(f.format(d));
        final String Q;
        if (b>=90&&b<=100) {
            Zhdj.setText("优秀");
            Q="A";
        }
        else if (b>=85&&b<=89){
            Zhdj.setText("良好");
            Q="B";
        }
        else if(b>=75&&b<=84){
            Zhdj.setText("一般");
            Q="C";
        }
        else if(b>=60&&b<=74){
            Zhdj.setText("较差");
            Q="D";
        }
        else{
            Zhdj.setText("不合格");
            Q="E";
        }
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent1=new Intent(Analysis.this, Ending.class);
              intent1.putExtra("M",Q);
              startActivity(intent1);
           }
        });
    }
}
