package com.ezraaigbe7gmail.prolivin;

/**
 * Created by ezraaigbe on 6/24/17.
 */

import java.util.ArrayList;
public class Workout {
    String workoutType;

    public Workout(String workoutType) {
        this.workoutType = workoutType;
        ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();
    }
    public String getWorkoutType() {
        return workoutType;
    }
}




