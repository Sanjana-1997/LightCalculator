package com.example.lightcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, ac, division, multiply, minus, plus, dot, equal, mod;
    private TextView result;
    private TextView question;
    float preval;
    private ImageView cut;
    boolean funAdd, funSub, funMul, funDiv, funMod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n0 = findViewById(R.id.n0);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        division = findViewById(R.id.division);
        mod = findViewById(R.id.mod);
        ac = findViewById(R.id.ac);
        cut = findViewById(R.id.cut);
        result = findViewById(R.id.result);
        question = findViewById(R.id.question);

        //AC button is working
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("0");
                question.setText("");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText().toString() + "0");
                question.setText(question.getText().toString() + "0");
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");
                question.setText(question.getText().toString() + "1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");
                question.setText(question.getText().toString() + "2");
            }
        });


        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
                question.setText(question.getText().toString() + "3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
                question.setText(question.getText().toString() + "4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
                question.setText(question.getText().toString() + "5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
                question.setText(question.getText().toString() + "6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
                question.setText(question.getText().toString() + "7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
                question.setText(question.getText().toString() + "8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
                question.setText(question.getText().toString() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + ".");
                question.setText(question.getText().toString() + ".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                question.setText(question.getText().toString() + "+");
                preval = Float.parseFloat(result.getText().toString());
                funAdd = true;
                result.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question.setText(question.getText().toString() + "-");
                preval = Float.parseFloat(result.getText().toString());
                funSub = true;
                result.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question.setText(question.getText().toString() + "*");
                preval = Float.parseFloat(result.getText().toString());
                funMul = true;
                result.setText(null);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question.setText(question.getText().toString() + "/");
                preval = Float.parseFloat(result.getText().toString());
                funDiv = true;
                result.setText(null);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question.setText(question.getText().toString() + "%");
                preval = Float.parseFloat(result.getText().toString());
                funMod = true;
                result.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (funAdd == true) {
                    question.setText(question.getText().toString() + "=");
                    result.setText(preval + Integer.parseInt(result.getText().toString()) + "");
                    funAdd = false;
                }
                if (funSub == true) {
                    result.setText(preval - Integer.parseInt(result.getText().toString()) + "");
                    funSub = false;
                }
                if (funMul == true) {
                    result.setText(preval * Integer.parseInt(result.getText().toString()) + "");
                    funMul = false;
                }
                if (funDiv == true) {
                    result.setText(preval / Integer.parseInt(result.getText().toString()) + "");
                    funDiv = false;
                }
                if (funMod == true) {
                    result.setText(preval % Integer.parseInt(result.getText().toString()) + "");
                    funDiv = false;
                }
            }
        });
    }

}
