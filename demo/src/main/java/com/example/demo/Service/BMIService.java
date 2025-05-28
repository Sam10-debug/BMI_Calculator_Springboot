package com.example.demo.Service;


import com.example.demo.Entity.BMI;
import com.example.demo.Entity.Person;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BMIService {

    public BMI BMIResponseService(Person person){
        double value = 0;
        String category ="";
        if (Objects.equals(person.getUnit().toLowerCase(), "metric")){
            value=(person.getWeight()/(person.getHeight()* person.getHeight()));
            value = Math.round(value * 100.0) / 100.0;

        }else if (Objects.equals(person.getUnit().toLowerCase(), "imperial")){

            value=(person.getWeight()*703/(person.getHeight()* person.getHeight()));
            value = Math.round(value * 100.0) / 100.0;
        }else{
            System.out.println("Invalid unit! unit is either metric or imperial ");
            throw new IllegalArgumentException("Invalid unit! Unit must be either 'metric' or 'imperial'.");
        }

        if (value<18.5){
            category="Underweight!";
            System.out.println("Underweight!");
        }else if(value>=18.5 && value<=24.9){
            category="Normal!";
            System.out.println("Normal!");
        }else if(value>=25 && value<=29.9){
            category="Overweight!";
            System.out.println("Overweight!");
        }else{
            category="Obese!! visit the gym brother";
            System.out.println("Obese!! visit the gym brother");
        }

        return  new BMI(value,category,person.getName());
    }
}
