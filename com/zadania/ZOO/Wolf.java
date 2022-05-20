package com.zadania.ZOO;

public class Wolf extends Animal implements Canine{
int fangLength;

    public Wolf(String name, double weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }
    @Override
    public void bark() {
        System.out.println("BARK !!! BARK !!! BARK !!!");
    }
    @Override
    public void introduce(){
        System.out.println(" I am a Wolf and I weigh " + this.getWeight() + " And my name id " + this.getName() + " . ");

    }
}
