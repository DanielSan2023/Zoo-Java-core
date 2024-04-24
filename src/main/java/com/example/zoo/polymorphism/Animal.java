package com.example.zoo.polymorphism;

public abstract class Animal {

    private final int personalNumber;
    private final String name;
    private Float weight;
    private final String breed;

    public Animal(int personalNumber, String name, Float weight, String breed) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void feedMe() {
        System.out.printf("%s: Mnam mnam! Thank you, I am not hungry anymore.%n", this.getClass().getSimpleName());
    }

    public void whoAmI() {
        System.out.printf("%s: My name is: %s and I am %s%n", this.getClass().getSimpleName(),this.name, this.getClass().getSimpleName());
    }


    public abstract void move();
}
