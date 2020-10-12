package com.alaizhashim.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText firstNumberEditText, secondNumberEditText;
    String toastMessage;
    boolean sum=false, minuse=false, divide=false,multiply=false;
    int firstNumber,secondNumber, result;
    Button plusButton, minuseButton, multiplyButton, divButton;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusButton=findViewById(R.id.plusButton);
        minuseButton=findViewById(R.id.minuseButton);
        multiplyButton=findViewById(R.id.multiplyButton);
        divButton=findViewById(R.id.divButton);
        textView=findViewById(R.id.textView);
        textView.setText("Welcome to my calculator");
        textView.setTextColor(0xfff00000);
        textView.setTextSize(20);
        firstNumberEditText=findViewById(R.id.first_numberEditText);
        secondNumberEditText=findViewById(R.id.second_numberEditText);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum=true;
                operation();
                displayResult(result);
            }
        });
        minuseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minuse=true;
                operation();
                displayResult(result);
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divide=true;
                operation();
                displayResult(result);
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiply=true;
                operation();
                displayResult(result);
            }
        });
    }//End of onCreate function
    public void operation(){
        firstNumber=Integer.parseInt(firstNumberEditText.getText()+"");
        secondNumber=Integer.parseInt(secondNumberEditText.getText()+"");
        if(sum==true){
            result=firstNumber+secondNumber;
            toastMessage="the result of addition is "+result;
            sum=false;
        }
        if(minuse==true){
            result=firstNumber-secondNumber;
            toastMessage="the result of subtraction is "+result;
            minuse=false;
        }
        if(divide==true){
            result=firstNumber/secondNumber;
            toastMessage="the result of division is "+result;
            divide=false;
        }
        if(multiply==true){
            result=firstNumber*secondNumber;
            toastMessage="the result of multiplication is "+result;
            multiply=false;
        }
    }//End of operation function
    public void displayResult(int result){
        Toast.makeText(this,toastMessage,Toast.LENGTH_LONG).show();
    }
}//End of MainActivity class
