package com.example.kh2191.digi_invi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class sign_in extends AppCompatActivity {
    Button b1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        this.setTitle("SIGNUP");
        b1 = (Button) findViewById(R.id.SignUp);
        b1.setOnClickListener(new View.OnClickListener()  {
            // TODO Auto-generated method stub
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),doLogin.class);
                startActivity(i);
                setContentView(R.layout.activity_do_login);
            }


        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent i = new Intent(getApplicationContext(),Login.class);
            startActivity(i);
            setContentView(R.layout.activity_login);
        }
        return super.onKeyDown(keyCode, event);
    }
}
