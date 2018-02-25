package com.example.kh2191.digi_invi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class members extends AppCompatActivity {
     ArrayList<HashMap<String,String>> member_List;
     ListView member_ListView;
     memberListView member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        this.setTitle("Members");
        member_ListView = (ListView) findViewById(R.id.listMembers);
        member =new memberListView(this, this.getmember_List());
        member_ListView.setAdapter(member);
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
    public ArrayList<HashMap<String,String>> getmember_List() {
        member_List= new ArrayList<HashMap<String,String>>();
        HashMap<String,String> member2 = new HashMap<String,String>();
        member2.put("name","Manojkumar Devadoss");
        member2.put("status","Paid");
        member_List.add(member2);

        HashMap<String,String> member3 = new HashMap<String,String>();
        member3.put("name","Sivaneshwaran Amsu");
        member3.put("status","Paid");
        member_List.add(member3);

        HashMap<String,String> member4 = new HashMap<String,String>();
        member4.put("name","Balakrishnan Boopathy");
        member4.put("status","Paid");
        member_List.add(member4);

        HashMap<String,String> member5 = new HashMap<String,String>();
        member5.put("name","Sarvanakumar Thangaraj");
        member5.put("status","Paid");
        member_List.add(member5);

        HashMap<String,String> member6 = new HashMap<String,String>();
        member6.put("name","Kicha Sujanthan");
        member6.put("status","Paid");
        member_List.add(member6);

        return member_List;
    }
}
