package com.example.bang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Bank_department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_department);

        ListView listView = (ListView) this.findViewById(R.id.listView);

        ArrayList<department> list = new ArrayList<>();

        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));
        list.add(new department(R.drawable.us, R.string.Buy, R.string.USA, R.string.sell));


        listadapter myListAdapter = new listadapter(this, list);
        listView.setAdapter(myListAdapter);
    }


}