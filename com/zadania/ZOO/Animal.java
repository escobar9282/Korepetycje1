package com.zadania.ZOO;

public abstract class Animal {
    private String name;
    private int ID;
    private double weight;
    private static int countID = 1;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.ID = countID;
        increaseCountID();
    }

    public String getName() {
        return name;
    }

    public abstract void introduce();


    public int getID() {
        return ID;
    }

    public double getWeight() {
        return weight;
    }
    public void increaseCountID() {
        countID++;
    }
}
