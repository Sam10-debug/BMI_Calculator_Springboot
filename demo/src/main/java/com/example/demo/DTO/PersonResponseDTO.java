package com.example.demo.DTO;

import com.example.demo.Entity.BMI;

public record PersonResponseDTO(String name, Integer age, BMI bmi) {
}
