package com.example.sportTeacher.controllers;
import com.example.sportTeacher.services.WorkoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequiredArgsConstructor
public class WorkoutController {
    private final WorkoutService workoutService;
    @GetMapping("/")
    public String workouts(Model model){
        model.addAttribute("workouts",workoutService.listWorkouts());
        return "workouts";
    }
}
