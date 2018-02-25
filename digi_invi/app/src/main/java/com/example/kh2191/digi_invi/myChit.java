package com.example.kh2191.digi_invi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class myChit extends AppCompatActivity {

    expandableMyChit listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String,List<HashMap<String,String>>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_chit);
        this.setTitle("My Chit Status");
        expListView = (ExpandableListView) findViewById(R.id.mychitExpView);
        prepareListData();
        Log.i("Test", "onCreate:"+listDataChild);
//        Toast.makeText(getApplicationContext(), listDataChild.toString() , Toast.LENGTH_SHORT).show();
        listAdapter = new expandableMyChit(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
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

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String,List<HashMap<String,String>>>();

        // Adding child data
        listDataHeader.add("Fixed Auction");
        listDataHeader.add("LuckDraw");
        listDataHeader.add("Fixed Auction");

        // Adding child data
        List<HashMap<String,String>> list1 = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> chit1 = new HashMap<String,String>();
        chit1.put("currentHolder","ManojKumar");
        chit1.put("nextChitDate","23 Nov 2017");
        list1.add(chit1);

        List<HashMap<String,String>> list2 = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> chit2 = new HashMap<String,String>();
        chit2.put("currentHolder","Balakrishnan");
        chit2.put("nextChitDate","24 Dec 2017");
        list2.add(chit2);

        List<HashMap<String,String>> list3 = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> chit3 = new HashMap<String,String>();
        chit3.put("currentHolder","Sarvanakumar");
        chit3.put("nextChitDate","25 Jan 2018");
        list3.add(chit3);

        listDataChild.put(listDataHeader.get(0), list1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), list2);
        listDataChild.put(listDataHeader.get(2),list3);
    }
    }



