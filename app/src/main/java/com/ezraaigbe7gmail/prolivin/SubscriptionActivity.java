package com.ezraaigbe7gmail.prolivin;


import android.support.v7.app.AppCompatActivity;
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

public class SubscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);
        ImageButton buttonSub=(ImageButton) findViewById(R.id.imageButton3);
        buttonSub.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                Intent i =new Intent(getApplicationContext(),ExplorePage.class);
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
