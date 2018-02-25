package com.example.kh2191.digi_invi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Dashboard extends AppCompatActivity {
    ListView chit_list ;
    ChitList_View chit_List_View ;
    ArrayList<HashMap<String,String>> chitList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        chit_list = (ListView) findViewById(R.id.chitList);
        chit_List_View=new ChitList_View(this, this.getChitList());
        chit_list.setAdapter(chit_List_View);
        chit_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListAdapter test = chit_list.getAdapter();
                Intent chitDetails = new Intent(getApplicationContext(),chitdetails.class);
                chitDetails.putExtra( "selectedData",chitList.get(i));
                startActivity(chitDetails);
                setContentView(R.layout.activity_chitdetails);

            }
        });
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
    public ArrayList<HashMap<String,String>> getChitList() {
        chitList= new ArrayList<HashMap<String,String>>();

//        HashMap<String,String> chit1 = new HashMap<String,String>();
//        chit1.put("title","Fixed Auction");
//        chit1.put("availability","Available 3");
//        chit1.put("total", "Total 10");
//        chit1.put("Amount","Rs.100000/-");
//        chit1.put("Joined","true");
//        chitList.add(chit1);

        HashMap<String,String> chit2 = new HashMap<String,String>();
        chit2.put("title","Fixed Auction");
        chit2.put("availability","Available 3");
        chit2.put("total", "Total 20");
        chit2.put("Amount","Rs.200000/-");
        chit2.put("Joined","true");
        chit2.put("Details", "Chit means a transaction whether called chit, chit fund, chitty, kuree or by any other name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical installments over a definite period and that each such subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to the prize amount");
        chit2.put("TimePeriod", "10 Months");
        chit2.put("Members", "20");
        chit2.put("PerMonth", "Rs 40000/-");
        chit2.put("Start_Date","20 NOV 2018");
        chitList.add(chit2);

        HashMap<String,String> chit3 = new HashMap<String,String>();
        chit3.put("title","Lucky Draw");
        chit3.put("availability","Available 3");
        chit3.put("total", "Total 30");
        chit3.put("Amount","Rs.300000/-");
        chit3.put("Joined","true");
        chit3.put("Details", "Chit means a transaction whether called chit, chit fund, chitty, kuree or by any other name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical installments over a definite period and that each such subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to the prize amount");
        chit3.put("TimePeriod", "10 Months");
        chit3.put("Members", "20");
        chit3.put("PerMonth", "Rs 40000/-");
        chit3.put("Start_Date","20 NOV 2018");
        chitList.add(chit3);

        HashMap<String,String> chit4 = new HashMap<String,String>();
        chit4.put("title","Lucky Draw");
        chit4.put("availability","Available 3");
        chit4.put("total", "Total 40");
        chit4.put("Amount","Rs.400000/-");
        chit4.put("Joined","false");
        chit4.put("Details", "Chit means a transaction whether called chit, chit fund, chitty, kuree or by any other name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical installments over a definite period and that each such subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to the prize amount");
        chit4.put("TimePeriod", "10 Months");
        chit4.put("Members", "20");
        chit4.put("PerMonth", "Rs 40000/-");
        chit4.put("Start_Date","20 NOV 2018");
        chitList.add(chit4);

        HashMap<String,String> chit5 = new HashMap<String,String>();
        chit5.put("title","Lucky Draw");
        chit5.put("availability","Available 3");
        chit5.put("total", "Total 50");
        chit5.put("Amount","Rs.500000/-");
        chit5.put("Joined","false");
        chit5.put("Details", "Chit means a transaction whether called chit, chit fund, chitty, kuree or by any other name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical installments over a definite period and that each such subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to the prize amount");
        chit5.put("TimePeriod", "10 Months");
        chit5.put("Members", "20");
        chit5.put("PerMonth", "Rs 40000/-");
        chit5.put("Start_Date","20 NOV 2018");
        chitList.add(chit5);

        HashMap<String,String> chit6 = new HashMap<String,String>();
        chit6.put("title","Lucky Draw");
        chit6.put("availability","Available 3");
        chit6.put("total", "Total 50");
        chit6.put("Amount","Rs.500000/-");
        chit6.put("Joined","true");
        chit6.put("Details", "Chit means a transaction whether called chit, chit fund, chitty, kuree or by any other name by or under which a person enters into an agreement with a specified number of persons that every one of them shall subscribe a certain sum of money (or a certain quantity of grain instead) by way of periodical installments over a definite period and that each such subscriber shall, in his turn, as determined by lot or by auction or by tender or in such other manner as may be specified in the chit agreement, be entitled to the prize amount");
        chit6.put("TimePeriod", "10 Months");
        chit6.put("Members", "20");
        chit6.put("PerMonth", "Rs 40000/-");
        chit6.put("Start_Date","20 NOV 2018");
        chitList.add(chit6);

        return chitList;
    }


}
