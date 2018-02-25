package com.example.kh2191.digi_invi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testMani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mani);
        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(i);
                setContentView(R.layout.activity_dashboard);
            }
        }));
    }
}
