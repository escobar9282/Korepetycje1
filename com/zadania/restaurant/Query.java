package com.zadania.restaurant;

import java.util.Random;

public class Query {
   private final Restaurant restaurant;


    public Query(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    synchronized public void get() {
restaurant.takeOneOrderToCrowd();
    }

    synchronized public void put() {
        restaurant.addOnePortionOfDish();
    }
}
