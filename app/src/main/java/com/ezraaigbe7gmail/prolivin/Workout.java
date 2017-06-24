package com.ezraaigbe7gmail.prolivin;

/**
 * Created by ezraaigbe on 6/24/17.
 */

import java.util.ArrayList;
public class Workout {
    String workoutType;
    ArrayList<Exercise> exerciseList;

    public Workout(String workoutType) {
        this.workoutType = workoutType;
        this.exerciseList = new ArrayList<Exercise>();
    }
    public String getWorkoutType() {
        return workoutType;
    }
}




