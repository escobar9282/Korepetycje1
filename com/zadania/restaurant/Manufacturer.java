package com.zadania.restaurant;

public class Manufacturer implements Runnable {
    Query queue;
    Thread thread;

    public Manufacturer(Query queue) {
        this.queue = queue;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        int producedEating = 0;

        while (producedEating <= 9) {
            try {
                Thread.sleep(5000);
                queue.put();
                producedEating++;
            } catch (InterruptedException stop) {
                System.out.println("Mistake has been made");
            }
        }
    }
}
