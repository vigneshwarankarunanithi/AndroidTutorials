package com.example.kh2191.digi_invi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by KH2191 on 24-02-2018.
 */

public class memberListView extends BaseAdapter {

    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;


    public memberListView(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.memberlist, null);

        TextView memberName = (TextView)vi.findViewById(R.id.lblmembername); // title
        TextView status = (TextView)vi.findViewById(R.id.lblMemberStatus); // artist name


        HashMap<String, String> member_List = new HashMap<String, String>();

        member_List =  data.get(position);

        // Setting all values in listview
        memberName.setText(member_List.get("name"));
        status.setText(member_List.get("status"));
        return vi;
    }
}
