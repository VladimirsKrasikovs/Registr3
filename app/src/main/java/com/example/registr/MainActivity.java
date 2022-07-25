package com.example.registr;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    EditText usernameInput;
    EditText emailInput;
    EditText cityInput;
    EditText passwordInput;
    EditText phoneInput;
    TextView result;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usernameInput = (EditText) findViewById(R.id.username);
        emailInput = (EditText) findViewById(R.id.email);
        phoneInput = (EditText) findViewById(R.id.phone);
        cityInput = (EditText) findViewById(R.id.city);
        passwordInput = (EditText) findViewById(R.id.password);
        submit = (Button) findViewById(R.id.submit);
        result = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usernameInput.getText().toString().isEmpty() || emailInput.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Empty text", Toast.LENGTH_SHORT).show();
                }else{
                    String username = usernameInput.getText().toString();
                    String email = emailInput.getText().toString();
                    String phone = phoneInput.getText().toString();
                    String city = cityInput.getText().toString();
                    String password = passwordInput.getText().toString();

                    result.setText("Name is "+username+"\n"+ "Your mail "+email+"\n"+"Your phone number is "+phone+"\n"+ "YOur city is "+ city+"\n"+"Your password is "+password);


                }
            }
        });
    }
}







