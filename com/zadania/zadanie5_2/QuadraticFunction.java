package com.zadania.zadanie5_2;

import java.util.Scanner;

public class QuadraticFunction {
    private double x1;
    private double x2;
    private double delta;
    private double a;
    private double b;
    private double c;

    public QuadraticFunction() {
    }

    public void loadData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        try {
            a = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("That's definitely not that number");

        }

        if (a == 0) {
            do {
                System.out.println("Entar a again ");
                a = sc.nextDouble();
            } while (a == 0);
        }
        try {
            System.out.println("Enter b");
            b = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException ex) {
            b = 0;
        }

        System.out.println("Enter c ");
        c = sc.nextDouble();
    }

    public void convertData() {
        delta = Math.pow(b, 2) - (4 * a * c);
        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            x1 = -b / (2 * a);


        } else {
            System.out.println("If delta is less than zero, nothing will be displayed");
        }
    }

    public void showScore() {
        if (delta > 0) {
            System.out.println("we will display x1 and x2 ");
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
