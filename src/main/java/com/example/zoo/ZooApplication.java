package com.example.zoo;


import com.example.zoo.animals.*;
import com.example.zoo.polymorphism.Animal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ZooApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZooApplication.class, args);

        System.out.println("Welcome to our zoo!%n%n");

        Cat cat = new Cat(1, "Murko", 20F, "Persian Cat", 2F, "Long");

        Dog dog = new Dog(2, "Dunco", 45F, "Shar pei", 2F, "short");

        Sloth sloth = new Sloth(3, "Cid", 45F, "dino", 23F);

        Shark shark = new Shark(4, "white", 250F, "White shark", 6f);

        Whale whale = new Whale(5, "Willy", 1250F, "kosatka", 12F);

        List<Animal> animals = List.of(cat, dog, sloth, shark, whale);

        animals.forEach(Animal::whoAmI);

        ZooKeeper keeper = new ZooKeeper("Gejza Lakotos");
        keeper.goForWalk(cat, dog, sloth);
        keeper.goForRun(cat, dog);
        keeper.goForSwim(shark, whale);
        keeper.goForSwim(shark, whale, cat, dog);
        keeper.feedAnimals(cat, dog, shark, whale, sloth);

        animals.forEach(Animal::move);
    }


}
