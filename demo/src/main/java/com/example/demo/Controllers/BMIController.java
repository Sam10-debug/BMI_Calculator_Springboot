package com.example.demo.Controllers;

import com.example.demo.DTO.PersonResponseDTO;
import com.example.demo.Entity.BMI;

import com.example.demo.DTO.PersonDTO;
import com.example.demo.Service.BMIService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BMIController {


    private final BMIService bmiService;

    public BMIController( BMIService bmiService) {
        this.bmiService = bmiService;
    }

    @PostMapping("/post-bmi")
    public PersonResponseDTO postBMI(@Valid @RequestBody PersonDTO person){
        return bmiService.BMIResponseService(person);
    }
}
