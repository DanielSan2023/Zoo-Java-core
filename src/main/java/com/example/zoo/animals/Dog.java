package com.example.zoo.animals;

import com.example.zoo.interfaces.Swimmable;
import com.example.zoo.polymorphism.TerrestrialAnimal;

public class Dog extends TerrestrialAnimal implements  Runnable, Swimmable {

    private final String hairType;

    public Dog(int personalNumber, String name, Float weight, String breed, Float height, String hairType) {
        super(personalNumber, name, weight, breed, height);
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }

    @Override
    public void move() {
        this.walk();
    }

    @Override
    public void run() {
        System.out.println("Dog: I am running.");
    }

    @Override
    public void walk() {
        System.out.println("Dog: I am walking.");
    }

    @Override
    public void swim() {
        System.out.printf("%s: I am swimming%n although I am not aquatic animal and",this.getClass().getSimpleName());

    }

    @Override
    public String toString() {
        return "Dog{" +
                "hairType='" + hairType + '\'' +
                '}';
    }
}
