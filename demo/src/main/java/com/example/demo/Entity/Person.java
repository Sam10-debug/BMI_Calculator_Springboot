package com.example.demo.Entity;

public class Person {
    private final double weight;
    private final double height;
    private final String unit;
    private final String name;
    private final int age;


    //constructor
    public Person(int weight, int height, String unit, String name, int age) {
        this.weight = weight;
        this.height = height;
        this.unit = unit;
        this.name = name;
        this.age = age;
    }

    //getters
    //there are no setters as the fields are final, the fields will be set using the constructor
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
