package com.example.zoo.animals;

import com.example.zoo.polymorphism.AquaticAnimal;

public class Shark extends AquaticAnimal {

    public Shark(int personalNumber, String name, Float weight, String breed, float lenght) {
        super(personalNumber, name, weight, breed, lenght);
    }

    @Override
    public void feedMe() {
        System.out.println("Shark: Thank you  I am not hungry today.");
    }

    @Override
    public void move() {
        this.swim();
    }
}
