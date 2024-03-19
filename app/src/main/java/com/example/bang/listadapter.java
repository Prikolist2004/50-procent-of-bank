package com.example.bang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listadapter extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<department> list;


    public listadapter(Context context, ArrayList<department> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public department getItem(int position) {
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
            v = LInflater.inflate(R.layout.item_bank_branch, parent, false);
            holder.flag = (ImageView) v.findViewById(R.id.flagImage);
            holder.name = (TextView) v.findViewById(R.id.name);
            holder.abbreviation = ((TextView) v.findViewById(R.id.abbreviation));
            holder.Capital = ((TextView) v.findViewById(R.id.capital));

            v.setTag(holder);
        }

        holder = (ViewHolder) v.getTag();
        department department = getData(position);

        holder.flag.setImageResource(department.getFlagID());
        holder.name.setText(v.getResources().getString(department.getNameID()));
        holder.abbreviation.setText(v.getResources().getString(department.getAbbreviationID()));
        holder.Capital.setText(v.getResources().getString(department.getCapitalID()));

        return v;
    }

    department getData(int position){
        return (getItem(position));
    }


    private static class ViewHolder {
        private ImageView flag;
        private TextView name;
        private TextView abbreviation;

        private TextView Capital;
    }
}
