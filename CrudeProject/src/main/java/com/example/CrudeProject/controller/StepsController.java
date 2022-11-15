package com.example.CrudeProject.controller;

import com.example.CrudeProject.entity.Steps;
import com.example.CrudeProject.service.StepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StepsController {
    @Autowired
    private StepsService stepsService;
    @PostMapping("/addStep")
    public Steps addSteps(@RequestBody Steps steps)
    {
        return stepsService.createSteps(steps);
    }
    @PostMapping("/addSteps")
    public List<Steps> addUser(@RequestBody List<Steps> steps)
    {
        return stepsService.createSteps(steps);
    }
    @GetMapping("/step/{id}")
    public Steps getStepsBYId(@PathVariable int id)
    {
        return stepsService.getStepsById(id);
    }
    @GetMapping("/steps")
    public List<Steps> getAllSteps()
    {
        return stepsService.getSteps();
    }
    @PutMapping("/updateStep/{id}")
    public Steps updateSteps(@PathVariable int id,@RequestBody Steps steps)
    {
        steps.setId(id);
        Steps updatedStep= stepsService.updateSteps(steps);
        return updatedStep;
    }
    @DeleteMapping("/step/{id}")
    public String deleteSteps(@PathVariable int id)
    {
        return stepsService.deleteStepsById(id);
    }
}

