package com.ezraaigbe7gmail.prolivin;

/**
 * Created by Lex on 6/24/17.
 */

public class Athlete {

    String aname;
    String ateam;
    String acollege;
    double aweight;
    int afeet;
    int ainches;
    int aage;



    public Athlete(String name, String team, String college, double weight, int feet, int inches, int age){

        this.aname = name;
        this.ateam = team;
        this.acollege = college;
        this.aweight = weight;
        this.afeet = feet;
        this.ainches = inches;
        this.aage = age;


    }

    public String getName(){
        return aname;
    }

    public String getTeam(){
        return ateam;
    }
    public String getCollege(){
        return acollege;
    }
    public double getWeight(){
        return aweight;
    }
    public int getFeet(){
        return afeet;
    }
    public int getInches(){
        return ainches;
    }
    public int getAge(){
        return aage;
    }



}
