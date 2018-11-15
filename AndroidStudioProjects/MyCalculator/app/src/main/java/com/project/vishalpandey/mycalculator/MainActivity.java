package com.project.vishalpandey.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button addition,subtraction,multiplication,division;
    private EditText et1,et2,et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition=(Button)findViewById(R.id.btnadd);
        subtraction=(Button)findViewById(R.id.btnsub);
        multiplication=(Button)findViewById(R.id.btnmul);
        division=(Button)findViewById(R.id.bntdiv);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.te3);


        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("")||et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter the number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    Double a1=Double.valueOf(et1.getText().toString());
                    Double a2=Double.valueOf(et2.getText().toString());
                    Double a3;
                    a3=a1+a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void  onClick(View view) {
                if (et1.getText().toString().equals("")||et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter the number",Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        et1.getText().toString();
                        et2.getText().toString();
                        Double a1=Double.valueOf(et1.getText().toString());
                        Double a2=Double.valueOf(et2.getText().toString());
                        Double a3;
                        a3=a1-a2;
                        et3.setText(String.valueOf(a3));
                                               }
                                           }
                                       }
        );
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter the number", Toast.LENGTH_SHORT).show();
                } else {
                    et1.getText().toString();
                    et2.getText().toString();
                    Double a1 = Double.valueOf(et1.getText().toString());
                    Double a2 = Double.valueOf(et2.getText().toString());
                    Double a3;
                    a3 = a1 * a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        } );
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter the number", Toast.LENGTH_SHORT).show();
                } else {
                    et1.getText().toString();
                    et2.getText().toString();
                    Double a1 = Double.valueOf(et1.getText().toString());
                    Double a2 = Double.valueOf(et2.getText().toString());
                    Double a3;
                    a3 = a1 / a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        } );
        }
    }