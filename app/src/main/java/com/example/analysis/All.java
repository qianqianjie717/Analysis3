package com.example.analysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class All extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
        Intent Intent=getIntent();
        String str= Intent.getStringExtra("xk1");
        String str2=Intent.getStringExtra("xk2");
        String str3=Intent.getStringExtra("xk3");
        String str4=Intent.getStringExtra("xk4");
        String Str1=Intent.getStringExtra("cj1");
        String Str2=Intent.getStringExtra("cj2");
        String Str3=Intent.getStringExtra("cj3");
        String Str4=Intent.getStringExtra("cj4");
        String STR1=Intent.getStringExtra("xf1");
        String STR2=Intent.getStringExtra("xf2");
        String STR3=Intent.getStringExtra("xf3");
        String STR4=Intent.getStringExtra("xf4");
//      得到上一个活动的学科名称，成绩，学分
        TextView XK1=(TextView) findViewById(R.id.textView);
        TextView XK2=(TextView) findViewById(R.id.textView2);
        TextView XK3=(TextView) findViewById(R.id.textView3);
        TextView XK4=(TextView) findViewById(R.id.textView4);
        TextView CJ1=(TextView) findViewById(R.id.text1);
        TextView CJ2=(TextView) findViewById(R.id.text2);
        TextView CJ3=(TextView) findViewById(R.id.text3);
        TextView CJ4=(TextView) findViewById(R.id.text4);
        TextView jd1=(TextView) findViewById(R.id.jd1);
        TextView jd2=(TextView) findViewById(R.id.jd2);
        TextView jd3=(TextView) findViewById(R.id.jd3);
        TextView jd4=(TextView) findViewById(R.id.jd4);
        TextView Spj=(TextView) findViewById(R.id.Text);
        TextView Spj2=(TextView) findViewById(R.id.Text2);
        TextView Spj3=(TextView) findViewById(R.id.Text3);
        TextView Spj4=(TextView) findViewById(R.id.Text4);
        XK1.setText(str);
        XK2.setText(str2);
        XK3.setText(str3);
        XK4.setText(str4);
        CJ1.setText(Str1);
        CJ2.setText(Str2);
        CJ3.setText(Str3);
        CJ4.setText(Str4);
//      输出学科名称，成绩
        Intent intent=getIntent();
        Bundle bd=intent.getExtras();
        //数据类型转换
        final double a;
        a=Integer.parseInt(Str1);
        final double b;
        b=Integer.parseInt(Str2);
        final double c;
        c=Integer.parseInt(Str3);
        final double d;
        d=Integer.parseInt(Str4);
        final double e;
        e=Integer.parseInt(STR1);
        final double f;
        f=Integer.parseInt(STR2);
        final double g;
        g=Integer.parseInt(STR3);
        final double h;
        h=Integer.parseInt(STR4);
        final double Jd1,Jd2,Jd3,Jd4;
        //判断绩点以及等级
        if(a>=90&&a<=100){
            Jd1=4.0;
            Spj.setText("A");
            jd1.setText(""+Jd1);
        }
        else if(a<=89&&a>=86){
            Jd1=3.7;
            Spj.setText("A-");
            jd1.setText(""+Jd1);
        }
        else if(a>=83&&a<=85){
            Jd1=3.3;
            Spj.setText("B+");
            jd1.setText(""+Jd1);
        }
        else if(a>=80&&a<=82){
            Jd1=3.0;
            Spj.setText("B");
            jd1.setText(""+Jd1);
        }
        else if(a<=79&&a>=76){
            Jd1=2.7;
            Spj.setText("B-");
            jd1.setText(""+Jd1);
        }
        else if(a<=75&&a>=73){
            Jd1=2.3;
            Spj.setText("C+");
            jd1.setText(""+Jd1);
        }
        else if(a>=70&&a<=72){
            Jd1=2.0;
            Spj.setText("C");
            jd1.setText(""+Jd1);
        }
        else if(a<=69&&a>=66){
            Jd1=1.7;
            Spj.setText("C-");
            jd1.setText(""+Jd1);
        }
        else if(a>=63&&a<=65){
            Jd1=1.3;
            Spj.setText("D+");
            jd1.setText(""+Jd1);
        }
        else if(a>=60&&a<=62){
            Jd1=1.3;
            Spj.setText("D");
            jd1.setText(""+Jd1);
        }
        else{
            Jd1=0.0;
            Spj.setText("F");
            jd1.setText(""+Jd1);
        }
        if(b>=90&&b<=100){
            Jd2=4.0;
            Spj2.setText("A");
            jd2.setText(""+Jd2);
        }
        else if(b<=89&&b>=86){
            Jd2=3.7;
            Spj2.setText("A-");
            jd2.setText(""+Jd2);
        }
        else if(b>=83&&b<=85){
            Jd2=3.3;
            Spj2.setText("B+");
            jd2.setText(""+Jd2);
        }
        else if(b>=80&&b<=82){
            Jd2=3.0;
            Spj2.setText("B");
            jd2.setText(""+Jd2);
        }
        else if(b<=79&&b>=76){
            Jd2=2.7;
            Spj2.setText("B-");
            jd2.setText(""+Jd2);
        }
        else if(b<=75&&b>=73){
            Jd2=2.3;
            Spj2.setText("C+");
            jd2.setText(""+Jd2);
        }
        else if(b>=70&&b<=72){
            Jd2=2.0;
            Spj2.setText("C");
            jd2.setText(""+Jd2);
        }
        else if(b<=69&&b>=66){
            Jd2=1.7;
            Spj2.setText("C-");
            jd2.setText(""+Jd2);
        }
        else if(b>=63&&b<=65){
            Jd2=1.3;
            Spj2.setText("D+");
            jd2.setText(""+Jd2);
        }
        else if(b>=60&&b<=62){
            Jd2=1.0;
            Spj2.setText("D");
            jd2.setText(""+Jd2);
        }
        else{
            Jd2=0.0;
            Spj2.setText("F");
            jd2.setText(""+Jd2);
        }
        if(c>=90&&c<=100){
            Jd3=4.0;
            Spj3.setText("A");
            jd3.setText(""+Jd3);
        }
        else if(c<=89&&c>=86){
            Jd3=3.7;
            Spj3.setText("A-");
            jd3.setText(""+Jd3);
        }
        else if(c>=83&&c<=85){
            Jd3=3.3;
            Spj3.setText("B+");
            jd3.setText(""+Jd3);
        }
        else if(c>=80&&c<=82){
            Jd3=3.0;
            Spj3.setText("B");
            jd3.setText(""+Jd3);
        }
        else if(c<=79&&c>=76){
            Jd3=2.7;
            Spj3.setText("B-");
            jd3.setText(""+Jd3);
        }
        else if(c<=75&&c>=73){
            Jd3=2.3;
            Spj3.setText("C+");
            jd3.setText(""+Jd3);
        }
        else if(c>=70&&c<=72){
            Jd3=2.0;
            Spj3.setText("C");
            jd3.setText(""+Jd3);
        }
        else if(c<=69&&c>=66){
            Jd3=1.7;
            Spj3.setText("C-");
            jd3.setText(""+Jd3);
        }
        else if(c>=63&&c<=65){
            Jd3=1.3;
            Spj3.setText("D+");
            jd3.setText(""+Jd3);
        }
        else if(c>=60&&c<=62){
            Jd3=1.0;
            Spj3.setText("D");
            jd3.setText(""+Jd3);
        }
        else{
            Jd3=0.0;
            Spj3.setText("F");
            jd3.setText(""+Jd3);
        }
        if(d>=90&&d<=100){
            Jd4=4.0;
            Spj4.setText("A");
            jd4.setText(""+Jd4);
        }
        else if(d<=89&&d>=86){
            Jd4=3.7;
            Spj4.setText("A-");
            jd4.setText(""+Jd4);
        }
        else if(d>=83&&d<=85){
            Jd4=3.3;
            Spj4.setText("B+");
            jd4.setText(""+Jd4);
        }
        else if(d>=80&&d<=82){
            Jd4=3.0;
            Spj4.setText("B");
            jd4.setText(""+Jd4);
        }
        else if(d<=79&&d>=76){
            Jd4=2.7;
            Spj4.setText("B-");
            jd4.setText(""+Jd4);
        }
        else if(d<=75&&d>=73){
            Jd4=2.3;
            Spj4.setText("C+");
            jd4.setText(""+Jd4);
        }
        else if(d>=70&&d<=72){
            Jd4=2.0;
            Spj4.setText("C");
            jd4.setText(""+Jd4);
        }
        else if(d<=69&&d>=66){
            Jd4=1.7;
            Spj4.setText("C-");
            jd4.setText(""+Jd4);
        }
        else if(d>=63&&d<=65){
            Jd4=1.3;
            Spj4.setText("D+");
            jd4.setText(""+Jd4);
        }
        else if(d>=60&&d<=62){
            Jd4=1.0;
            Spj4.setText("D");
            jd4.setText(""+Jd4);
        }
        else{
            Jd4=0.0;
            Spj4.setText("F");
            jd4.setText(""+Jd4);
        }
        //计算总学分，综合成绩等
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(All.this, Analysis.class);
                final double zongxuefen=e+f+g+h;
                final String A=String.valueOf(zongxuefen);
                intent.putExtra("zxf",A);
                final double zonghechengji=(a+b+c+d)/4;
                final String B=String.valueOf(zonghechengji);
                intent.putExtra("zhcj",B);
                final double jidian=(a*Jd1+b*Jd2+c*Jd3+d*Jd4)/4;
                final String C=String.valueOf(jidian);
                intent.putExtra("jd",C);
                final double jiaquanpingjunfen=(a*e+b*f+c*g+d*h)/(e+f+g+h);
                final String D=String.valueOf(jiaquanpingjunfen);
                intent.putExtra("jqpjf",D);
                final double fangcha=((a-zonghechengji)*(a-zonghechengji)+(b-zonghechengji)*(b-zonghechengji)+(c-zonghechengji)*(c-zonghechengji)+(d-zonghechengji)*(d-zonghechengji))/4;
                final String E=String.valueOf(fangcha);
                intent.putExtra("fc",E);
                startActivity(intent);

            }
        });
    }
}
