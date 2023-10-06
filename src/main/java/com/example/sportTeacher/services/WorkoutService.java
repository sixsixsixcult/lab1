package com.example.sportTeacher.services;

import com.example.sportTeacher.models.Workout;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService {
    private List<Workout> workoutList = new ArrayList<>();
    {
        workoutList.add(new Workout("Сушка","для опытных","Сушка тела за продолжительный период времени"));
        workoutList.add(new Workout("Набор мышечной массы","для опытных","Набор сухой мышечной массы за продолжительный период времени"));
    }
    public List<Workout> listWorkouts(){return workoutList;}
    public void saveWorkout(Workout workout){
        workoutList.add(workout);
    }
}
