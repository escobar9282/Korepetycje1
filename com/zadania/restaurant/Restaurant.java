package com.zadania.restaurant;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Restaurant {
    Random dish = new Random();
    private AtomicInteger amountOfIceCreams;
    private AtomicInteger amountOfGyros;
    private AtomicInteger amountOfTortillas;
    private AtomicInteger amountOfPizzas;
    private AtomicInteger amountOfSteaks;
    private AtomicInteger moneyEarned;
    private AtomicInteger moneyLost;
    private Menu restaurantMenu;


    public Restaurant() {
        amountOfIceCreams = new AtomicInteger(3);
        amountOfGyros = new AtomicInteger(3);
        amountOfTortillas = new AtomicInteger(3);
        amountOfPizzas = new AtomicInteger(3);
        amountOfSteaks = new AtomicInteger(3);
        moneyEarned = new AtomicInteger(0);
        moneyLost = new AtomicInteger(0);
    }

    public void addOnePortionOfDish() {
        amountOfIceCreams.addAndGet(1);
        amountOfGyros.addAndGet(1);
        amountOfTortillas.addAndGet(1);
        amountOfPizzas.addAndGet(1);
        amountOfSteaks.addAndGet(1);

    }

    public void takeOneOrderToCrowd() {
        int randomDish = dish.nextInt(5);
        switch (randomDish) {
            case 0 -> takeIceCreams(dish.nextInt(5) + 2);
            case 1 -> takeGyros(dish.nextInt(5) + 2);
            case 2 -> takeTortillas(dish.nextInt(5) + 2);
            case 3 -> takePizzas(dish.nextInt(5) + 2);
            case 4 -> takeSteaks(dish.nextInt(5) + 2);

        }
    }

    private void takeIceCreams(int numberOfOrders) {
        if (numberOfOrders > amountOfIceCreams.intValue()) {
            int howManyIceCreamWeCantSell = numberOfOrders - amountOfIceCreams.intValue();
            moneyEarned.addAndGet(amountOfIceCreams.intValue() * Menu.ICE_CREAM.getPrize());
            moneyLost.addAndGet(howManyIceCreamWeCantSell * Menu.ICE_CREAM.getPrize());
            amountOfIceCreams.set(0);
        } else {
            moneyEarned.addAndGet(numberOfOrders * Menu.ICE_CREAM.getPrize());
            amountOfIceCreams.set(amountOfIceCreams.intValue() - numberOfOrders);
        }
    }

    private void takeGyros(int numberOfOrders) {
        if (numberOfOrders > amountOfGyros.intValue()) {
            int howManyGyrosWeCantSell = numberOfOrders - amountOfGyros.intValue();
            moneyEarned.addAndGet(amountOfGyros.intValue() * Menu.GYROS.getPrize());
            moneyLost.addAndGet(howManyGyrosWeCantSell * Menu.GYROS.getPrize());
            amountOfGyros.set(0);

        } else {
            moneyEarned.addAndGet(numberOfOrders * Menu.GYROS.getPrize());
            amountOfGyros.set(amountOfGyros.intValue() - numberOfOrders);
        }
    }

    private void takeTortillas(int numberOfOrders) {
        if (numberOfOrders > amountOfTortillas.intValue()) {
            int howManyTortillasWeCantSell = numberOfOrders - amountOfTortillas.intValue();
            moneyEarned.addAndGet(amountOfTortillas.intValue() * Menu.TORTILLA.getPrize());
            moneyLost.addAndGet(howManyTortillasWeCantSell * Menu.TORTILLA.getPrize());
            amountOfTortillas.set(0);
        } else {
            moneyEarned.addAndGet(numberOfOrders * Menu.TORTILLA.getPrize());
            amountOfTortillas.set(amountOfTortillas.intValue() - numberOfOrders);
        }
    }

    private void takePizzas(int numberOfOrders) {
        if (numberOfOrders > amountOfPizzas.intValue()) {
            int howManyPizzasWeCantSell = numberOfOrders - amountOfPizzas.intValue();
            moneyEarned.addAndGet(amountOfPizzas.intValue() * Menu.PIZZA.getPrize());
            moneyLost.addAndGet(howManyPizzasWeCantSell * Menu.PIZZA.getPrize());
            amountOfPizzas.set(0);
        } else {
            moneyEarned.addAndGet(numberOfOrders * Menu.PIZZA.getPrize());
            amountOfPizzas.set(amountOfPizzas.intValue() - numberOfOrders);
        }

    }

    private void takeSteaks(int numberOfOrders) {
        if (numberOfOrders > amountOfSteaks.intValue()) {
            int howManySteaksWeCantSell = numberOfOrders - amountOfSteaks.intValue();
            moneyEarned.addAndGet(amountOfSteaks.intValue() * Menu.STEAK.getPrize());
            moneyLost.addAndGet(howManySteaksWeCantSell * Menu.STEAK.getPrize());
            amountOfSteaks.set(0);
        } else {
            moneyEarned.addAndGet(numberOfOrders * Menu.STEAK.getPrize());
            amountOfSteaks.set(amountOfSteaks.intValue() - numberOfOrders);
        }
    }

    private void showCurrentInformationAboutRestaurant() {
        System.out.print("Money earned " + moneyEarned + " money lost " + moneyLost);
        System.out.println("Current Stock " + amountOfIceCreams + " IceCreams " + amountOfGyros + " Gyros");
        System.out.println(amountOfTortillas + " Tortillas " + amountOfPizzas + " Pizzas " + amountOfSteaks + " Steaks");
    }

    public AtomicInteger getAmountOfIceCreams() {
        return amountOfIceCreams;
    }

    public AtomicInteger getAmountOfGyros() {
        return amountOfGyros;
    }

    public AtomicInteger getAmountOfTortillas() {
        return amountOfTortillas;
    }

    public AtomicInteger getAmountOfPizzas() {
        return amountOfPizzas;
    }

    public AtomicInteger getAmountOfSteaks() {
        return amountOfSteaks;
    }

    public AtomicInteger getMoneyEarned() {
        return moneyEarned;
    }

    public AtomicInteger getMoneyLost() {
        return moneyLost;
    }

    public enum Menu {
        ICE_CREAM(8), GYROS(12), TORTILLA(13), PIZZA(18), STEAK(30);

        private final int prize;

        Menu(int prize) {
            this.prize = prize;
        }

        public int getPrize() {
            return prize;
        }
    }
}
