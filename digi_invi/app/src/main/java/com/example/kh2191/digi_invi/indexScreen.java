package com.example.kh2191.digi_invi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class indexScreen extends AppCompatActivity {
    RelativeLayout chits,myChits,schedule,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_screen);
        this.setTitle("Dashboard");

        chits = (RelativeLayout)findViewById(R.id.layoutChits);
        chits.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent navToChit = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(navToChit);
                setContentView(R.layout.activity_dashboard);
            }
        }));

        myChits = (RelativeLayout)findViewById(R.id.layMyChits);
        myChits.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent navToChit = new Intent(getApplicationContext(),myChit.class);
                startActivity(navToChit);
                setContentView(R.layout.activity_my_chit);
            }
        }));

        schedule = (RelativeLayout)findViewById(R.id.laySchdule);
        schedule.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
               /* Intent navToSchedule = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(navToSchedule);
                setContentView(R.layout.activity_dashboard);*/
            }
        }));

        logout = (RelativeLayout)findViewById(R.id.layLogout);
        logout.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent navToLogin = new Intent(getApplicationContext(),doLogin.class);
                startActivity(navToLogin);
                setContentView(R.layout.activity_do_login);
            }
        }));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent i = new Intent(getApplicationContext(),indexScreen.class);
            startActivity(i);
            setContentView(R.layout.activity_index_screen);
        }
        return super.onKeyDown(keyCode, event);
    }
}
