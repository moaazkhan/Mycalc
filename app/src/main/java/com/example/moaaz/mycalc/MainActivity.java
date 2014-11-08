package com.example.moaaz.mycalc;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    static boolean  a=false;
    static boolean  b=false;
    static boolean  c=false;
    static boolean  d=false;
    static float inp1=0;
    static float inp2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ans = (TextView)findViewById(R.id.textView);
        ans.setText("0");



        final Button button = (Button)findViewById(R.id.Button);
        final Button button1 = (Button)findViewById(R.id.Button1);
        final Button button2 = (Button)findViewById(R.id.Button2);
        final Button button3 = (Button)findViewById(R.id.Button3);
        final Button button4 = (Button)findViewById(R.id.Button4);
        final Button button5 = (Button)findViewById(R.id.Button5);
        final Button button6 = (Button)findViewById(R.id.Button6);
        final Button button7 = (Button)findViewById(R.id.Button7);
        final Button button8 = (Button)findViewById(R.id.Button8);
        final Button button9 = (Button)findViewById(R.id.Button9);
        final Button button10 = (Button)findViewById(R.id.Button10);
        final Button button11 = (Button)findViewById(R.id.Button11);
        final Button button12 = (Button)findViewById(R.id.Button12);
        final Button button13 = (Button)findViewById(R.id.Button13);
        final Button button14 = (Button)findViewById(R.id.Button14);
        final Button button15 = (Button)findViewById(R.id.Button15);
        final Button button16 = (Button)findViewById(R.id.Button16);
        final Button button17 = (Button)findViewById(R.id.Button17);
        final Button button18 = (Button)findViewById(R.id.Button18);
        final Button button19 = (Button)findViewById(R.id.Button19);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(ans.getText().toString()) ;
                int num2=Math.round(num1);
                int num3=num2/10;

                ans.setText(Integer.toString(num3));
                hideKeyboard();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ans.setText(Float.toString(0));
                inp1=0;
                inp2=0;
                hideKeyboard();
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ans.setText(Float.toString(0));
                inp1=0;
                inp2=0;
                hideKeyboard();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(ans.getText().toString()) ;

                float num2=num1/100;

                ans.setText(Float.toString(num2));
                hideKeyboard();
                hideKeyboard();
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+7;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(7));

                }
                hideKeyboard();
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+8;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(8));

                }
                hideKeyboard();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+9;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(9));

                }
                hideKeyboard();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+4;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(4));

                }
                hideKeyboard();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+5;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(5));

                }
                hideKeyboard();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+6;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(6));

                }
                hideKeyboard();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+1;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(1));

                }
                hideKeyboard();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+2;
                    ans.setText(Float.toString(num2));
                }
                else
                {
                    ans.setText(Float.toString(2));
                }
                hideKeyboard();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+3;
                    ans.setText(Float.toString(num2));
                }
                else{
                    ans.setText(Float.toString(3));
                }
                hideKeyboard();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*10)+0;
                    ans.setText(Float.toString(num2));
                }
                else{
                    ans.setText(Float.toString(0));
                }
                hideKeyboard();
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(ans.getText().toString());
                if(num1>0) {
                    float num2 = (num1*100)+0;
                    ans.setText(Float.toString(num2));
                }
                else {
                    ans.setText(Float.toString(0));

                }
                hideKeyboard();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp1=Float.parseFloat(ans.getText().toString());

                a=true;

                b=false;
                c=false;
                d=false;






                ans.setText("0");

                hideKeyboard();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp1=Float.parseFloat(ans.getText().toString());

                d=false;
                a=false;
                b=true;
                c=false;







                ans.setText("0");

                hideKeyboard();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp1=Float.parseFloat(ans.getText().toString());

                d=false;
                a=false;
                b=false;
                c=true;








                ans.setText("0");

                hideKeyboard();
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp1=Float.parseFloat(ans.getText().toString());

                d=true;
                a=false;
                b=false;
                c=false;







                ans.setText("0");

                hideKeyboard();
            }
        });





        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inp2=Float.parseFloat(ans.getText().toString());


                if (a)
                {
                    ans.setText(Float.toString(inp1/inp2));
                }
                if (b)
                {
                    ans.setText(Float.toString(inp1*inp2));
                }

                if (c)
                {
                    ans.setText(Float.toString(inp1-inp2)) ;


                }
                if (d)
                {
                    ans.setText(Float.toString(inp1+inp2));


                }





                hideKeyboard();
            }
        });





    }












    private void hideKeyboard() {
        InputMethodManager inputManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);

        // check if no view has focus:
        View view = this.getCurrentFocus();
        if (view != null) {
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }



}
