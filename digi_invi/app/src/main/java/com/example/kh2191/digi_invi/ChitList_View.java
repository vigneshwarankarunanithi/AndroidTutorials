package com.example.kh2191.digi_invi;

/**
 * Created by KH2191 on 20-02-2018.
 */
import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ChitList_View extends BaseAdapter {
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;


    public ChitList_View(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.chit_list, null);

        TextView title = (TextView)vi.findViewById(R.id.title); // title
        TextView availability = (TextView)vi.findViewById(R.id.lblAvailable); // artist name
        TextView total = (TextView)vi.findViewById(R.id.lblTotal); // duration
        ImageView imageView = (ImageView) vi.findViewById(R.id.imgTick);
         TextView Amount = (TextView)vi.findViewById(R.id.lblAmount);

        HashMap<String, String> chit_List = new HashMap<String, String>();

        chit_List =  data.get(position);

        // Setting all values in listview
        title.setText(chit_List.get("title"));
        availability.setText(chit_List.get("availability"));
        total.setText(chit_List.get("total"));
        Amount.setText(chit_List.get("Amount"));
        if(chit_List.get("Joined").equals("true"))
          imageView.setImageResource(R.drawable.greentick);
        else
           imageView.setVisibility(View.INVISIBLE);
        return vi;
    }
}

