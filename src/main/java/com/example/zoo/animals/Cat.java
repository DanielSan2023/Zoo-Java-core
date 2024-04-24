package com.example.zoo.animals;

import com.example.zoo.interfaces.Swimmable;
import com.example.zoo.polymorphism.TerrestrialAnimal;

public class Cat extends TerrestrialAnimal implements Runnable, Swimmable {

    private final String hairType;

    public Cat(int personalNumber, String name, Float weight, String breed, Float height, String hairType) {
        super(personalNumber, name, weight, breed, height);
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }

    @Override
    public void whoAmI() {
        System.out.println("I am cat");
    }

    @Override
    public void move() {
        this.walk();
    }

    @Override
    public void run() {
        System.out.println("Cat: i am running.");
    }

    @Override
    public void walk() {
        System.out.println("Cat: I am walk.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hairType='" + hairType + '\'' +
                '}';
    }

    @Override
    public void swim() {
        System.out.printf("%s: I am swimming %n although I am not aquatic animal.%n", this.getClass().getSimpleName());
    }
}




