package com.example.bang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bank_exchange_rates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_exchange_rates);

        ListView listView = (ListView) this.findViewById(R.id.ListView2);

        ArrayList<rates> list = new ArrayList<>();

        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Department, R.string.OpenTime));
        list.add(new rates(R.string.Street, R.string.Info, R.string.Bankomat, R.string.DayWork));





        listadapter2 myListAdapter2 = new listadapter2(this, list);
        listView.setAdapter(myListAdapter2);

    }
}