package com.example.moaaz.mycalc;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit1= (EditText)findViewById(R.id.first);
        final EditText edit2= (EditText)findViewById(R.id.second);
        final Button add = (Button)findViewById(R.id.add);
        final Button sub = (Button)findViewById(R.id.sub);
        final Button mul = (Button)findViewById(R.id.mul);
        final Button div = (Button)findViewById(R.id.div);
        final TextView ans = (TextView)findViewById(R.id.ans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(edit1.getText().toString());
                float num2 = Float.parseFloat(edit2.getText().toString());
                float num3 = num1 + num2;

                ans.setText(Float.toString(num3));
                hideKeyboard();
//
//
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(edit1.getText().toString());
                float num2=Float.parseFloat(edit2.getText().toString());
                float num3= num1 - num2;

                ans.setText(Float.toString(num3));
                hideKeyboard();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(edit1.getText().toString());
                float num2 = Float.parseFloat(edit2.getText().toString());
                float num3 = num1 * num2;

                ans.setText(Float.toString(num3));
                hideKeyboard();
            }
        });

        // testing

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(edit1.getText().toString());
                float num2 = Float.parseFloat(edit2.getText().toString());
                float num3 = num1 / num2;

                ans.setText(Float.toString(num3));
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
