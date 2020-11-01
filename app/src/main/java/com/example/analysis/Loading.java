package com.example.analysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Button button=(Button) findViewById(R.id.button);
        final EditText editText=(EditText) findViewById(R.id.editText);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
        final EditText editText3=(EditText) findViewById(R.id.editText3);
        final EditText editText4=(EditText) findViewById(R.id.editText4);
        final EditText EditText1=(EditText) findViewById(R.id.EditText1);
        final EditText EditText2=(EditText) findViewById(R.id.EditText2);
        final EditText EditText3=(EditText) findViewById(R.id.EditText3);
        final EditText EditText4=(EditText) findViewById(R.id.EditText4);
        final EditText Edit1=(EditText) findViewById(R.id.Edit1);
        final EditText Edit2=(EditText) findViewById(R.id.Edit2);
        final EditText Edit3=(EditText) findViewById(R.id.Edit3);
        final EditText Edit4=(EditText) findViewById(R.id.Edit4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editText.getText().toString();
                String str2=editText2.getText().toString();
                String str3=editText3.getText().toString();
                String str4=editText4.getText().toString();
                String Str1=EditText1.getText().toString();
                String Str2=EditText2.getText().toString();
                String Str3=EditText3.getText().toString();
                String Str4=EditText4.getText().toString();
                String STR1=Edit1.getText().toString();
                String STR2=Edit2.getText().toString();
                String STR3=Edit3.getText().toString();
                String STR4=Edit4.getText().toString();
//                得到数据转化成浮点型，进行运算
             /*  double a=Integer.parseInt(Str1);
                double b=Integer.parseInt(Str2);
                double c=Integer.parseInt(Str3);
                double d=Integer.parseInt(Str4);
                double e=Integer.parseInt(STR1);
                double f=Integer.parseInt(STR2);
                double g=Integer.parseInt(STR3);
                double h=Integer.parseInt(STR4);
//               判断输入条件*/
              /*  if(str.length()==0||str2.length()==0||str3.length()==0||str4.length()==0||Str1.length()==0||Str2.length()==0||Str3.length()==0||Str4.length()==0||STR1.length()==0||STR2.length()==0||STR3.length()==0||STR4.length()==0){

                }*/
                if ((TextUtils.isEmpty(str))||(TextUtils.isEmpty(str2))||(TextUtils.isEmpty(str3))||(TextUtils.isEmpty(str4))||(TextUtils.isEmpty(Str1))||(TextUtils.isEmpty(Str2))||
                        (TextUtils.isEmpty(Str2))||(TextUtils.isEmpty(Str3))||(TextUtils.isEmpty(Str3))||(TextUtils.isEmpty(Str4))||
                        (TextUtils.isEmpty(STR1))||(TextUtils.isEmpty(STR2))||(TextUtils.isEmpty(STR3))||(TextUtils.isEmpty(STR4))) Toast.makeText(Loading.this, "重新输入", Toast.LENGTH_LONG).show();

               else if(Double.parseDouble(Str1)>100||Double.parseDouble(Str2)>100||Double.parseDouble(Str3)>100||Double.parseDouble(Str4)>100||Double.parseDouble(STR1)
                        >100||Double.parseDouble(STR2)>100||Double.parseDouble(STR3)>100||Double.parseDouble(STR4)>100){
                    Toast.makeText(Loading.this, "重新输入", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(Loading.this, "报告生成", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(Loading.this,All.class);
                    intent.putExtra("xk1",str);
                    intent.putExtra("xk2",str2);
                    intent.putExtra("xk3",str3);
                    intent.putExtra("xk4",str4);
                    intent.putExtra("cj1",Str1);
                    intent.putExtra("cj2",Str2);
                    intent.putExtra("cj3",Str3);
                    intent.putExtra("cj4",Str4);
                    intent.putExtra("xf1",STR1);
                    intent.putExtra("xf2",STR2);
                    intent.putExtra("xf3",STR3);
                    intent.putExtra("xf4",STR4);
                    startActivity(intent);
                }
            }
        });
    }
}
