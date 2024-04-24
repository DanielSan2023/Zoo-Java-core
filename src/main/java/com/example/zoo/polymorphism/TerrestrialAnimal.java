package com.example.zoo.polymorphism;

import com.example.zoo.interfaces.Walkable;

public abstract class TerrestrialAnimal extends Animal implements Walkable {

    private Float height;

    public TerrestrialAnimal(int personalNumber, String name, Float weight, String breed, Float height) {
        super(personalNumber, name, weight, breed);
        this.height = height;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

}
