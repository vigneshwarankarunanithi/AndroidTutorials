package com.example.kh2191.digi_invi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by KH2191 on 25-02-2018.
 */

public class expandableMyChit extends BaseExpandableListAdapter {
    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String,List<HashMap<String,String>>> _listDataChild;
    public expandableMyChit(Context context, List<String> listDataHeader,
                            HashMap<String,List<HashMap<String,String>>> listChildData) {

        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }



    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }
    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerText = (String) getGroup(groupPosition);
        System.out.println("###header text"+headerText);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.mychitheader, null);
        }

        TextView txtListChild = (TextView) convertView
                .findViewById(R.id.myChitTitle);

        txtListChild.setText(headerText);
        return convertView;

    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {



        HashMap<String, String>  MychitDetail = new HashMap<String, String>();
        MychitDetail =  (HashMap<String,String>)getChild(groupPosition, childPosition);
        System.out.println("####My Chit Detail"+MychitDetail);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.mychitdetails, null);
        }

        TextView lblNextChitDate = (TextView) convertView
                .findViewById(R.id.NextChitDate);
        TextView lblCurrentHolder = (TextView) convertView.findViewById(R.id.currentChitHolderName);
        lblNextChitDate.setText(MychitDetail.get("nextChitDate"));
        lblCurrentHolder.setText(MychitDetail.get("currentHolder"));
        final TextView goToMemberList = (TextView) convertView.findViewById(R.id.lblGoToMembers);
        goToMemberList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(_context,members.class);
                _context.startActivity(i);
            }
        });
        return convertView;


    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
