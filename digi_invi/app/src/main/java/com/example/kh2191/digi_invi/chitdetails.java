package com.example.kh2191.digi_invi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class chitdetails extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitdetails);
        Intent i = getIntent();
        HashMap<String,String> chitDetails = (HashMap<String,String>)i.getSerializableExtra("selectedData");
      //  Toast.makeText(getApplicationContext(), chitDetails.toString() , Toast.LENGTH_SHORT).show();
        this.setTitle(chitDetails.get("title"));
        this.setText(R.id.lblChitDesc,chitDetails.get("Details"));
        this.setText(R.id.lblTotalAmount,chitDetails.get("Amount"));
        this.setText(R.id.lblStartDate,chitDetails.get("Start_Date"));
        this.setText(R.id.lblMembers,chitDetails.get("Members"));
        this.setText(R.id.lblTotalAmountPerMnth,chitDetails.get("PerMonth"));
        this.setText(R.id.lblTTP,chitDetails.get("TimePeriod"));
        if(chitDetails.get("Joined").equals("true"))
            this.setText(R.id.btnJoin, "Joined");
        else
            this.setText(R.id.btnJoin, "Join Now");

        TextView goToMemberList = (TextView)findViewById(R.id.lblGoToMembers);
        goToMemberList.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),members.class);
                startActivity(i);
                setContentView(R.layout.activity_members);
            }
        }));
//        ProgressDialog progress = new ProgressDialog(this);
//        progress.setTitle("Loading");
//        progress.setMessage("Wait while loading...");
//        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
//        progress.show();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent i = new Intent(getApplicationContext(),Dashboard.class);
            startActivity(i);
            setContentView(R.layout.activity_dashboard);
        }
        return super.onKeyDown(keyCode, event);
    }

    public void setText(int id, String text){
        txt = (TextView)findViewById(id);
        txt.setText(text);
    }
}
