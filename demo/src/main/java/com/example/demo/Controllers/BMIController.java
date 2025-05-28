package com.example.demo.Controllers;

import com.example.demo.Entity.BMI;
import com.example.demo.Entity.Person;
import com.example.demo.Service.BMIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class BMIController {

    private final BMIService bmiService;

    public BMIController( BMIService bmiService) {
        this.bmiService = bmiService;
    }

    @PostMapping("/post-bmi")
    public BMI postBMI(@RequestBody Person person){
        return bmiService.BMIResponseService(person);
    }
}
