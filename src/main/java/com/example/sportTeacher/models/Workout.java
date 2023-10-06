package com.example.sportTeacher.models;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Workout {
    private String purpose; //цель
    private String forWhom; //для кого
    private String description;

}
