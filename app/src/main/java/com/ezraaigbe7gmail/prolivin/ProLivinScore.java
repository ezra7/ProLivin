package com.ezraaigbe7gmail.prolivin;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProLivinScore extends AppCompatActivity {
    static double lBench = 65;

    static double lSquat = 70;

    static double hFourty = 10;

    static double lPower = 70;

    static double lVert = 7;

    static double maxBench = 345;

    static double maxSquat = 480;

    static double leastFourty = 4.4;

    static double maxPower = 300;

    static double maxVert = 40;

    static double incBench = 28;

    static double incSquat = 41;

    static double incFourty = 0.56;

    static double incPower = 23;

    static double incVert = 3.3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_livin_score);

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
        ImageButton buttonExp =(ImageButton) findViewById(R.id.imageButton2);
        buttonExp.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                Intent i =new Intent(getApplicationContext(),SubscriptionActivity.class);
                startActivity(i);
            }
        });
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                EditText ourbench = (EditText)findViewById(R.id.bench);
                EditText oursquat = (EditText)findViewById(R.id.squat);
                EditText ourfourty = (EditText)findViewById(R.id.foury);
                EditText ourpower = (EditText)findViewById(R.id.power);
                EditText ourvertical = (EditText)findViewById(R.id.vertical);

                if(ourbench.getText().toString().equals("") || oursquat.getText().toString().equals("") || ourfourty.getText().toString().equals("") || ourpower.getText().toString().equals("") || ourvertical.getText().toString().equals("")){
                Context context = getApplicationContext();
                CharSequence text = "Please fill in all values";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
                else {
                    int total = getBench(Double.parseDouble(ourbench.getText().toString())) + getSquat(Double.parseDouble(oursquat.getText().toString())) + getFourty(Double.parseDouble(ourfourty.getText().toString())) + getPower(Double.parseDouble(ourpower.getText().toString())) + getVert(Double.parseDouble(ourvertical.getText().toString()));


                    Context context = getApplicationContext();
                    CharSequence text = "Your PLS is: " + total;
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }






            }
        });

    }
    public static int getBench(double mBench){

        if(mBench >= maxBench){

            return 10;

        }

        mBench -= lBench;

        int count = 0;

        while(mBench >= 0){

            mBench -= incBench;

            if(mBench >= 0){

                count++;

            }

        }


        return count;

    }

    public static int getSquat(double mSquat){

        if(mSquat >= maxSquat){

            return 20;

        }

        mSquat -= lSquat;

        int count = 0;

        while(mSquat >= 0){

            mSquat -= incSquat;

            if(mSquat >= 0){

                count++;

            }

        }


        return count*2;

    }

    public static int getFourty(double mFourty){

        if(mFourty <= leastFourty){

            return 30;

        }

        mFourty = hFourty-mFourty;

        int count = 0;

        while(mFourty >= 0){

            mFourty -= incFourty;

            if(mFourty >=0){

                count++;

            }

        }



        return count*3;

    }

    public static int getPower(double mPower){

        if(mPower >= maxPower){

            return 20;

        }

        mPower -= lPower;

        int count = 0;

        while(mPower >= 0){

            mPower -= incPower;

            if(mPower >= 0){

                count++;

            }

        }


        return count*2;

    }

    public static int getVert(double mVert){

        if(mVert >= maxVert){

            return 20;

        }

        mVert -= lVert;

        int count = 0;

        while(mVert >= 0){

            mVert -= incVert;

            if(mVert >= 0){

                count++;

            }

        }


        return count*2;

    }
}
