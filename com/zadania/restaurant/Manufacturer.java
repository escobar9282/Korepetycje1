package com.zadania.restaurant;

public class Manufacturer implements Runnable {
    Query queue;
    Thread thread;

    public Manufacturer(Query queue) {
        this.queue = queue;
        thread = new Thread(this)
    }



}
