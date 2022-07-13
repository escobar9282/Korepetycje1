package com.zadania.restaurant;

import java.util.Random;

public class Consumer implements Runnable {
    Random quickRandom;
    Query queryMethod;
    Thread thread;
    int timeTillCrowdTakesMeal;

    public Consumer(Query queryMethod) {
        this.queryMethod = queryMethod;
        thread = new Thread(this);
        quickRandom = new Random();
    }

    @Override
    public void run() {
        int mealTakenByCrowd = 0;
        while (mealTakenByCrowd <= 9) {
            try {
                setTimeAfterWhichCrowdComesToEat();
                Thread.sleep(timeTillCrowdTakesMeal);
                queryMethod.get();
                mealTakenByCrowd++;
            }
            catch (InterruptedException excptn) {
                System.out.println("An exception has been made");
            }
        }
    }

    private void setTimeAfterWhichCrowdComesToEat() {
        int randomTime = quickRandom.nextInt(4) + 1;
        timeTillCrowdTakesMeal = 1000 * randomTime;
    }
}
