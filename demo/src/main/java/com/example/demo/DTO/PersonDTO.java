package com.example.demo.DTO;

import jakarta.validation.constraints.*;

public record PersonDTO(
        @NotNull(message = "Weight cannot be null")
        @Positive(message = "Weight must be a positive number")
        @Max(value = 500, message = "Weight must be less than 500")
        Double weight,
        @NotNull(message = "Height cannot be null")
        @Positive(message = "Height must be a positive number")
//        @Max(value = 3, message = "Height must be less than 3 meters")
        Double height,
        @NotNull(message = "Unit system cannot be null")
        @Pattern(regexp = "(?i)metric|imperial", message = "Unit system must be 'metric' or 'imperial' (case insensitive)")
        String unit,
        @NotBlank(message = "Name cannot be blank")
        @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
        String name,
        @NotNull(message = "Age cannot be null")
        @Min(value = 1, message = "Age must be at least 1")
//        @Max(value = 120, message = "Age must be less than 120")
        Integer age) {

}
