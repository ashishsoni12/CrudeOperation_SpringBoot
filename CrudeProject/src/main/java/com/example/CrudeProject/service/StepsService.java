package com.example.CrudeProject.service;

import com.example.CrudeProject.dao.StepsRepository;
import com.example.CrudeProject.entity.Steps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StepsService {
    @Autowired
    private StepsRepository stepsService;
    public Steps createSteps(Steps steps)
    {
        return stepsService.save(steps);
    }
    public List<Steps> createSteps(List<Steps> stepsList)
    {
        return stepsService.saveAll(stepsList);
    }

    public Steps getStepsById(int id)
    {
        return stepsService.findById(id).orElse(null);
    }
    public List<Steps> getSteps()
    {
        return stepsService.findAll();
    }
    public Steps updateSteps(Steps steps)
    {
         return stepsService.save(steps);
    }
    public String deleteStepsById(int id)
    {
        stepsService.deleteById(id);
        return "user got deleted";
    }
}
