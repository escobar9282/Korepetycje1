package com.zadania.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Query query = new Query(restaurant);
        Manufacturer manufacturer = new Manufacturer(query);
        Consumer consumer = new Consumer(query);

        consumer.thread.start();
        manufacturer.thread.start();
    }
}
