package com.zadania.ZOO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bear bear = new Bear("Bear", 289.92, 40);
        Tiger tiger = new Tiger("Tiger", 150.23, 25);
        Dog dog = new Dog("Barry", 30.31);
        Wolf wolf = new Wolf("wolf", 40, 40);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(bear);
        animalList.add(tiger);
        animalList.add(wolf);
        animalList.add(dog);
        for (Animal animal:animalList) {
            animal.introduce();
        }
    }
}