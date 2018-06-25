package com.avneek.calculator;

import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.NaN;

public class MainActivity extends AppCompatActivity {

   private  Button one,two,three,four,five,six,seven,eight,nine,zero,clear,equal,dot,plus,minus,divide,multiply;
    private TextView exp,result;
   private char ACTION;
   private double var1 = NaN;
   private double var2;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        dot = findViewById(R.id.dot);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply =findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        exp=findViewById(R.id.exp);
        result= findViewById(R.id.result);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exp.setText(exp.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exp.setText(exp.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = '+';
                result.setText(String.valueOf(var1)+"+");
                exp.setText(null);


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               compute();
               ACTION = '-';
                result.setText(String.valueOf(var1)+"-");
                exp.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = '*';
                result.setText(String.valueOf(var1)+"*");
                exp.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               compute();
                ACTION = '/';
                result.setText(String.valueOf(var1)+"/");
                exp.setText(null);

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exp.setText(exp.getText().toString().substring(0,exp.getText().toString().length()-1));

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION='=';
                result.setText(result.getText().toString()+String.valueOf(var2)+"="+String.valueOf(var1));
                exp.setText(null);




            }
        });



    }


    void compute(){
        if(!Double.isNaN(var1)){
            var2 = Double.parseDouble(String.valueOf(exp.getText()));
            switch(ACTION){
                case '+':
                    var1 = var1+var2;
                    break;
                case '-':
                    var1 = var1-var2;
                    break;
                case '*':
                    var1 = var1*var2;
                    break;
                case '/':
                    var1 /=var2;
                    break;
                case '=' :
                    break;
            }

        }
        else{

                var1 = Double.parseDouble(String.valueOf(exp.getText()));


        }
    }



}
