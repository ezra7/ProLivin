package com.ezraaigbe7gmail.prolivin;

/**
 * Created by ezraaigbe on 6/24/17.
 */

public class Exercise {
    String exerciseName;
    int rep;
    int weight;


    public Exercise (String exerciseName, int rep, int weight) {
        this.exerciseName = exerciseName;
        this.rep = rep;
        this.weight = weight;

    }

    public String getExerciseName() {
        return exerciseName;
    }

    public int getRep(){
        return rep;
    }

    public int getWeight(){
        return weight;
    }
}



