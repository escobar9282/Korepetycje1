package com.zadania.restaurant;

import java.util.Random;

public class Query {
    Restaurant restaurant;


    public Query(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    synchronized public int get() {

    }

    synchronized public void put() {
        restaurant.addOnePortionOfDish();
    }
}
