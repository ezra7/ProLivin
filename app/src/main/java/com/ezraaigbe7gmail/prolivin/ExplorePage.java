package com.ezraaigbe7gmail.prolivin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ExplorePage extends AppCompatActivity {
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_explore_page);
        ListView lv = (ListView) findViewById(R.id.listView);



        ArrayList<String> alist = new ArrayList<String>();

        alist.add("Russell Wilson");

        alist.add("Richard Sherman");

        alist.add("Odell Beckham Jr.");

        alist.add("James Harrison");

        alist.add("Le'Veon Bell");

        alist.add("Le'Veon Bell");

        alist.add("Le'Veon Bell");

        alist.add("Le'Veon Bell");

        alist.add("Le'Veon Bell");

        alist.add("Le'Veon Bell");

        alist.add("Le'Veon Bell");

        alist.add("Le'Veon Bell");

        adapter = new ArrayAdapter<String> (
                this,
                android.R.layout.simple_selectable_list_item,
                alist );

        lv.setAdapter(adapter);
        alist.add("test3");
        alist.add("test2");
        alist.add("test");

        adapter.notifyDataSetChanged();
        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick (AdapterView adapter, View view ,int position, long arg){
                if (position == 0) {
                    Intent appInfo = new Intent(ExplorePage.this, LoginActivity.class);
                    startActivity(appInfo);
                }
                if (position == 1) {
                    Intent english = new Intent(ExplorePage.this, LoginActivity.class);
                    startActivity(english);
                }
                /*if (position == 2) {
                    Toast.makeText(getApplicationContext(), "You have selected pst3", Toast.LENGTH_LONG).show();
                }
                */
            }
        });
    }

}
