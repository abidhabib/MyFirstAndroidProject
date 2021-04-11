package com.example.icalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public   class MainActivity extends AppCompatActivity {
    private static View view;
    EditText ed1;
    String oldNum="";
    String newNum="";
    String number="";

    String op="";
    Boolean newOp=true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.edittext); }
    public void numberEvent(View view){
        if(newOp)
            ed1.setText("");
        newOp=false;
        number =ed1.getText().toString();
        switch (view.getId()){
            case R.id.b0:
                number+="0";
                break;
            case R.id.b1:
                number+="1";                    break;}
        switch (view.getId()){                    case R.id.b2:
            number+="2";                        break;                case R.id.b3:
            number+="3";                                break;
            case R.id.b4:
                number+="4";
                break;
            case R.id.b5:
                number+="5";
                break;
            case R.id.b6:
                number+="6";
                break;
            case R.id.b7:
                number+="7";
                break;
            case R.id.b8:
                number+="8";
                break;
            case R.id.b9:
                number+="9";
                break;
            case R.id.bdot:
                number+=".";
                break;
            case R.id.bsub:
                number+="-";
                break;
            case R.id.badd:
                number+="+";
                break;
            case R.id.bmul:
                number+="*";
                break;
            case R.id.bdiv:
                number+="/";
                break;}


        ed1.setText(number);
    }

    public void opEvent(View view) {
        newOp=true;
        oldNum=ed1.getText().toString();
        switch (view.getId()){
            case R.id.badd: op="+";
                break;
            case R.id.bsub: op="-";
                break;
            case R.id.bmul: op="*";
                break;
            case R.id.bdiv: op="/";
                break;
            case R.id.bmod: op="%";
                break;
        }
    }

    public void bCut(View view) {
        newOp=true;
        switch (view.getId()){
            case R.id.remove:

                break;

        }
        ed1.setText(number);
    }
    public void eqEvent(View view) {
        newNum=ed1.getText().toString();
        Double result=0.0;
        switch (op){
            case "+": result=Double.parseDouble(oldNum)+Double.parseDouble(newNum);
                break;
            case "-": result=Double.parseDouble(oldNum)-Double.parseDouble(newNum);
                break;
            case "/": result=Double.parseDouble(oldNum)/Double.parseDouble(newNum);
                break;
            case "*": result=Double.parseDouble(oldNum)*Double.parseDouble(newNum);
                break;
        }
        ed1.setText(result+"");
        result=0.0;
    }
    public void acEvent(View view) {
        ed1.setText("0");
        newOp=true;
    }}