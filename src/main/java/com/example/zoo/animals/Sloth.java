package com.example.zoo.animals;

import com.example.zoo.polymorphism.TerrestrialAnimal;

public class Sloth extends TerrestrialAnimal {

    public Sloth(int personalNumber, String name, Float weight, String breed, Float height) {
        super(personalNumber, name, weight, breed, height);
    }

    @Override
    public void move() {
       this.walk();
    }

    @Override
    public void walk() {
        System.out.println("Sloth: I am  walking really slowly.");
    }
}
