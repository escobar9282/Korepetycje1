package com.zadania.ZOO;

public class Tiger extends Animal {
    int clawLength;

    public Tiger(String name, double weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }
    @Override
    public void introduce() {
        System.out.println(" I am a Tiger my name is " + this.getName() + " And my weight is  " + this.getWeight() + " And my claw length is "+ this.clawLength + " . ");
    }
}
