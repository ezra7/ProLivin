package com.ezraaigbe7gmail.prolivin;
import java.util.ArrayList;
/**
 * Created by Lex on 6/24/17.
 */

public class Master {
    public static Athlete demo1;
    public static Athlete demo2;
    public static Athlete demo3;
    public static Athlete demo4;
    public static Athlete demo5;
    public static Athlete demo6;

    public static WorkoutPlan workout1;
    public static WorkoutPlan workout2;
    public static WorkoutPlan workout3;
    public static WorkoutPlan workout4;
    public static WorkoutPlan workout5;
    public static WorkoutPlan workout6;




    public static void Main(String[] args){

        demo1 = new Athlete("Russell Wilson", "Seattle Seahawks", "University of Wisconsin", 206, 5, 11, 28);
        demo2 = new Athlete("Richard Sherman", "Seattle Seahawks", "Stanford University", 194, 6, 3, 29);
        demo3 = new Athlete("Odell Beckham Jr.", "New York Giants", "Louisiana State University", 198, 5, 11, 24);
        demo4 = new Athlete("James Harrison", "Pittsburgh Steelers", "Kent State University", 275, 6, 0, 39);
        demo5 = new Athlete("Le'Veon Bell", "Pittsburgh Steelers", "Michigan State University", 225, 6, 1, 25);
        demo6 = new Athlete("Evan Mathis", "Arizona Cardinals", "University of Alabama", 302, 6, 5, 35);



        workout1 = new WorkoutPlan();
        workout2 = new WorkoutPlan();
        workout3 = new WorkoutPlan();
        workout4 = new WorkoutPlan();
        workout5 = new WorkoutPlan();
        workout6 = new WorkoutPlan();

        workout1.workoutList.add(new Workout("Legs/Abs"));
        workout1.workoutList.add(new Workout("Chest"));
        workout1.workoutList.add(new Workout("Back/Abs"));
        workout1.workoutList.add(new Workout("Rest"));
        workout1.workoutList.add(new Workout("Shoulder/Abs"));
        workout1.workoutList.add(new Workout("Arms"));
        workout1.workoutList.add(new Workout("Rest"));


        workout2.workoutList.add(new Workout("Legs/Abs"));
        workout2.workoutList.add(new Workout("Chest"));
        workout2.workoutList.add(new Workout("Back/Abs"));
        workout2.workoutList.add(new Workout("Rest"));
        workout2.workoutList.add(new Workout("Shoulder/Abs"));
        workout2.workoutList.add(new Workout("Arms"));
        workout2.workoutList.add(new Workout("Rest"));

        workout3.workoutList.add(new Workout("Legs/Abs"));
        workout3.workoutList.add(new Workout("Chest"));
        workout3.workoutList.add(new Workout("Back/Abs"));
        workout3.workoutList.add(new Workout("Rest"));
        workout3.workoutList.add(new Workout("Shoulder/Abs"));
        workout3.workoutList.add(new Workout("Arms"));
        workout3.workoutList.add(new Workout("Rest"));


        workout4.workoutList.add(new Workout("Legs/Abs"));
        workout4.workoutList.add(new Workout("Chest"));
        workout4.workoutList.add(new Workout("Back/Abs"));
        workout4.workoutList.add(new Workout("Rest"));
        workout4.workoutList.add(new Workout("Shoulder/Abs"));
        workout4.workoutList.add(new Workout("Arms"));
        workout4.workoutList.add(new Workout("Rest"));


        workout5.workoutList.add(new Workout("Legs/Abs"));
        workout5.workoutList.add(new Workout("Chest"));
        workout5.workoutList.add(new Workout("Back/Abs"));
        workout5.workoutList.add(new Workout("Rest"));
        workout5.workoutList.add(new Workout("Shoulder/Abs"));
        workout5.workoutList.add(new Workout("Arms"));
        workout5.workoutList.add(new Workout("Rest"));

        workout6.workoutList.add(new Workout("Legs/Abs"));
        workout6.workoutList.add(new Workout("Chest"));
        workout6.workoutList.add(new Workout("Back/Abs"));
        workout6.workoutList.add(new Workout("Rest"));
        workout6.workoutList.add(new Workout("Shoulder/Abs"));
        workout6.workoutList.add(new Workout("Arms"));
        workout6.workoutList.add(new Workout("Rest"));


        workout1.workoutList.get(0).exerciseList.add(new Exercise("Squat", 3, 10, 150));
        workout1.workoutList.get(0).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout1.workoutList.get(1).exerciseList.add(new Exercise("Bench Press", 3, 10, 250));
        workout1.workoutList.get(1).exerciseList.add(new Exercise("Inclined Bench Press", 3, 10, 250));
        workout1.workoutList.get(2).exerciseList.add(new Exercise("Barbell Deadlift", 3, 7, 300));
        workout1.workoutList.get(2).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout1.workoutList.get(4).exerciseList.add(new Exercise("Shoulder Press", 3, 10, 180));
        workout1.workoutList.get(4).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout1.workoutList.get(5).exerciseList.add(new Exercise("Push ups", 3, 30, 150));
        workout1.workoutList.get(5).exerciseList.add(new Exercise("Bicep Curls", 3, 15, 150));

        workout2.workoutList.get(0).exerciseList.add(new Exercise("Squat", 3, 10, 150));
        workout2.workoutList.get(0).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout2.workoutList.get(1).exerciseList.add(new Exercise("Bench Press", 3, 10, 250));
        workout2.workoutList.get(1).exerciseList.add(new Exercise("Inclined Bench Press", 3, 10, 250));
        workout2.workoutList.get(2).exerciseList.add(new Exercise("Barbell Deadlift", 3, 7, 300));
        workout2.workoutList.get(2).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout2.workoutList.get(4).exerciseList.add(new Exercise("Shoulder Press", 3, 10, 180));
        workout2.workoutList.get(4).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout2.workoutList.get(5).exerciseList.add(new Exercise("Push ups", 3, 10, 150));
        workout2.workoutList.get(5).exerciseList.add(new Exercise("Bicep Curls", 3, 15, 150));

        workout3.workoutList.get(0).exerciseList.add(new Exercise("Squat", 3, 10, 150));
        workout3.workoutList.get(0).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout3.workoutList.get(1).exerciseList.add(new Exercise("Bench Press", 3, 10, 250));
        workout3.workoutList.get(1).exerciseList.add(new Exercise("Inclined Bench Press", 3, 10, 250));
        workout3.workoutList.get(2).exerciseList.add(new Exercise("Barbell Deadlift", 3, 7, 300));
        workout3.workoutList.get(2).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout3.workoutList.get(4).exerciseList.add(new Exercise("Shoulder Press", 3, 10, 180));
        workout3.workoutList.get(4).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout3.workoutList.get(5).exerciseList.add(new Exercise("Push ups", 3, 10, 150));
        workout3.workoutList.get(5).exerciseList.add(new Exercise("Bicep Curls", 3, 15, 150));

        workout4.workoutList.get(0).exerciseList.add(new Exercise("Squat", 3, 10, 150));
        workout4.workoutList.get(0).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout4.workoutList.get(1).exerciseList.add(new Exercise("Bench Press", 3, 10, 250));
        workout4.workoutList.get(1).exerciseList.add(new Exercise("Inclined Bench Press", 3, 10, 250));
        workout4.workoutList.get(2).exerciseList.add(new Exercise("Barbell Deadlift", 3, 7, 300));
        workout4.workoutList.get(2).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout4.workoutList.get(4).exerciseList.add(new Exercise("Shoulder Press", 3, 10, 180));
        workout4.workoutList.get(4).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout4.workoutList.get(5).exerciseList.add(new Exercise("Push ups", 3, 10, 150));
        workout4.workoutList.get(5).exerciseList.add(new Exercise("Bicep Curls", 3, 15, 150));

        workout5.workoutList.get(0).exerciseList.add(new Exercise("Squat", 3, 10, 150));
        workout5.workoutList.get(0).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout5.workoutList.get(1).exerciseList.add(new Exercise("Bench Press", 3, 10, 250));
        workout5.workoutList.get(1).exerciseList.add(new Exercise("Inclined Bench Press", 3, 10, 250));
        workout5.workoutList.get(2).exerciseList.add(new Exercise("Barbell Deadlift", 3, 7, 300));
        workout5.workoutList.get(2).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout5.workoutList.get(4).exerciseList.add(new Exercise("Shoulder Press", 3, 10, 180));
        workout5.workoutList.get(4).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout5.workoutList.get(5).exerciseList.add(new Exercise("Push ups", 3, 10, 150));
        workout5.workoutList.get(5).exerciseList.add(new Exercise("Bicep Curls", 3, 15, 150));

        workout6.workoutList.get(0).exerciseList.add(new Exercise("Squat", 3, 10, 150));
        workout6.workoutList.get(0).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout6.workoutList.get(1).exerciseList.add(new Exercise("Bench Press", 3, 10, 250));
        workout6.workoutList.get(1).exerciseList.add(new Exercise("Inclined Bench Press", 3, 10, 250));
        workout6.workoutList.get(2).exerciseList.add(new Exercise("Barbell Deadlift", 3, 7, 300));
        workout6.workoutList.get(2).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout6.workoutList.get(4).exerciseList.add(new Exercise("Shoulder Press", 3, 10, 180));
        workout6.workoutList.get(4).exerciseList.add(new Exercise("Situps", 3, 20, 50));
        workout6.workoutList.get(5).exerciseList.add(new Exercise("Push ups", 3, 10, 150));
        workout6.workoutList.get(5).exerciseList.add(new Exercise("Bicep Curls", 3, 15, 150));



    }
}
