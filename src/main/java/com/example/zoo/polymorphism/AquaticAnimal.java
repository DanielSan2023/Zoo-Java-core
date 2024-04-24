package com.example.zoo.polymorphism;

import com.example.zoo.interfaces.Swimmable;

public abstract class AquaticAnimal extends Animal implements Swimmable {

    private float length;

    public AquaticAnimal(int personalNumber, String name, Float weight, String breed, float lenght) {
        super(personalNumber, name, weight, breed);
        this.length = lenght;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public void swim() {
        System.out.printf("%s: I am swimming%n", this.getClass().getSimpleName());
    }
}
