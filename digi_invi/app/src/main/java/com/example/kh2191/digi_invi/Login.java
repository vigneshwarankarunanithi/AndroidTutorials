package com.example.kh2191.digi_invi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1 = (Button) findViewById(R.id.btnSignup);
        b1.setOnClickListener(new View.OnClickListener()  {
            // TODO Auto-generated method stub
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),sign_in.class);
                startActivity(i);
                setContentView(R.layout.activity_sign_in);
            }

        });

        b2 = (Button) findViewById(R.id.btnLogin);
        b2.setOnClickListener(new View.OnClickListener()  {
            // TODO Auto-generated method stub
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),doLogin.class);
                startActivity(i);
                setContentView(R.layout.activity_do_login);
            }

        });
    }


}
