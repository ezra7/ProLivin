package com.ezraaigbe7gmail.prolivin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import android.widget.AdapterView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ExplorePage extends AppCompatActivity {
    ArrayAdapter<String> adapter;

 ImageButton a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_explore_page);
        ListView lv = (ListView) findViewById(R.id.listView);

        a = (ImageButton) findViewById(R.id.imageButton2);
        a.setOnClickListener(null);

        ArrayList<String> alist = new ArrayList<String>();

        alist.add("Russell Wilson");

        alist.add("Richard Sherman");

        alist.add("Odell Beckham Jr.");

        alist.add("James Harrison");

        alist.add("Le'Veon Bell");

        alist.add("Evan Mathis");


        adapter = new ArrayAdapter<String> (
                this,
                android.R.layout.simple_selectable_list_item,
                alist );


        lv.setAdapter(adapter);
        ImageButton yourButton;





        adapter.notifyDataSetChanged();
        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick (AdapterView adapter, View view ,int position, long arg){


                if (position == 0) {
                    Intent appInfo = new Intent(ExplorePage.this, AthleteProfile.class);
                    startActivity(appInfo);
                }
                if (position == 1) {
                    Intent english = new Intent(ExplorePage.this, AthleteProfile2.class);
                    startActivity(english);
                }
                if (position == 2) {
                    //Toast.makeText(getApplicationContext(), "You have selected pst3", Toast.LENGTH_LONG).show();
                    Intent english = new Intent(ExplorePage.this, AthleteProfile3.class);
                    startActivity(english);
                }
                if (position == 3) {
                    Intent english = new Intent(ExplorePage.this, AthleteProfile4.class);
                    startActivity(english);
                }
                if (position == 4) {
                    Intent english = new Intent(ExplorePage.this, AthleteProfile5.class);
                    startActivity(english);
                }
                if (position == 5) {
                    Intent english = new Intent(ExplorePage.this, AthleteProfile6.class);
                    startActivity(english);
                }
            }
        });
        ImageButton buttonSub=(ImageButton) findViewById(R.id.imageButton2);
        buttonSub.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                Intent i =new Intent(getApplicationContext(),SubscriptionActivity.class);
                startActivity(i);
            }
        });
        ImageButton buttonExp =(ImageButton) findViewById(R.id.imageButton5);
        buttonExp.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                Intent i =new Intent(getApplicationContext(),ProLivinScore.class);
                startActivity(i);
            }
        });
    }



}
