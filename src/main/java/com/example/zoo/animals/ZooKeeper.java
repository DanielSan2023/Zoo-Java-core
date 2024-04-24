package com.example.zoo.animals;

import com.example.zoo.interfaces.Swimmable;
import com.example.zoo.interfaces.Walkable;
import com.example.zoo.polymorphism.Animal;
import com.example.zoo.polymorphism.AquaticAnimal;
import com.example.zoo.polymorphism.TerrestrialAnimal;

import java.lang.Runnable;
import java.util.Arrays;

public class ZooKeeper {

    public ZooKeeper(String name) {
        System.out.printf("\n Hello I am zoo keeper %s%n", name);
    }

    public void goForWalk(TerrestrialAnimal... animals) {
        System.out.println("\n");
        System.out.println("Walking with animals...");
        Arrays.stream(animals).forEach(Walkable::walk);
        System.out.println("End of walking.");
    }

    public void goForRun(Runnable... animals) {
        System.out.println("\n");
        System.out.println("Run with animals...");
        Arrays.stream(animals).forEach(Runnable::run);
        System.out.println("End of running.");
    }

    public void goForSwim(AquaticAnimal... animals) {
        System.out.println("\n");
        System.out.println("Swimming with animals...");
        Arrays.stream(animals).forEach(Swimmable::swim);
        System.out.println("End of swimming.");
    }

    public void goForSwim(Swimmable... animals) { // there is using static polymorphism, all animals who can swim.
        System.out.println("\n");
        System.out.println("Swimming with animals...");
        Arrays.stream(animals).forEach(Swimmable::swim);
        System.out.println("End of swimming.");
    }

    public void feedAnimals(Animal... animals) {
        System.out.println("\n");
        System.out.println("Feeding animals...");
        Arrays.stream(animals).forEach(Animal::feedMe);
        System.out.println("End of feeding.");
    }

}
