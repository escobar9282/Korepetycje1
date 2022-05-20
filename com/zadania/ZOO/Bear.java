package com.zadania.ZOO;

public class Bear extends Animal {
    int furLength;

    public Bear(String name, double weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    @Override
    public void introduce(){
        System.out.println(this.getID() + " : " + " I'm a bear. And I weigh " + this.getWeight() + " and my name is " + this.getName() + " And my fur length is " + this.furLength + " . ");
    }
}
