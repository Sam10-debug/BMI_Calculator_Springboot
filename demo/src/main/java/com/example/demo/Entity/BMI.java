package com.example.demo.Entity;

public class BMI {
    private final double value;
    private final String category;
    private final String name;

    public BMI(double value, String category, String name) {
        this.value = value;
        this.category = category;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getCategory() {
        return category;
    }
}
