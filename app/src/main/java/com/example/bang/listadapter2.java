package com.example.bang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listadapter2 extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<rates> list;


    public listadapter2(Context context, ArrayList<rates> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public rates getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        View v = convertView;


        if ( v == null){
            holder = new ViewHolder();
            v = LInflater.inflate(R.layout.item_bank_branch2, parent, false);
            holder.flag = (TextView) v.findViewById(R.id.street);
            holder.name = (TextView) v.findViewById(R.id.workHours);
            holder.abbreviation = ((TextView) v.findViewById(R.id.bankom));
            holder.Capital = ((TextView) v.findViewById(R.id.Hours));

            v.setTag(holder);
        }

        holder = (ViewHolder) v.getTag();
        rates rates = getData(position);

        holder.flag.setText(rates.getFlagID());
        holder.name.setText(v.getResources().getString(rates.getNameID()));
        holder.abbreviation.setText(v.getResources().getString(rates.getAbbreviationID()));
        holder.Capital.setText(v.getResources().getString(rates.getCapitalID()));

        return v;
    }

    rates getData(int position){
        return (getItem(position));
    }


    private static class ViewHolder {
        private TextView flag;
        private TextView name;
        private TextView abbreviation;

        private TextView Capital;
    }
}
