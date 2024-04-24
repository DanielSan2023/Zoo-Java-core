package com.example.zoo.animals;

import com.example.zoo.polymorphism.AquaticAnimal;

public class Whale extends AquaticAnimal {

    public Whale(int personalNumber, String name, Float weight, String breed, float lenght) {
        super(personalNumber, name, weight, breed, lenght);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am whale");
    }

    @Override
    public void move() {
        this.swim();

    }

    @Override
    public void swim() {
        System.out.printf("$sWhale: I am lazy to swim today%n", this.getClass().getSimpleName());
    }
}
