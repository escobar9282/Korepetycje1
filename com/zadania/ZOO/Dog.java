package com.zadania.ZOO;

public class Dog extends Animal implements Canine{
    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void introduce() {
        System.out.println(" I am a dog my name is " + this.getName() + " And i weigh "  + this.getWeight());
    }

    @Override
    public void bark() {
        System.out.println(" bark bark bark !!! .");

}

 public void sitPretty(){
     System.out.println("Sit pretty");
 }
}
