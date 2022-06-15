package com.zadania.zadanie5_6;

public class Triangle {
    public static int checkTriangle(int n) {
        if (n > 1) {
            return (n + (checkTriangle(n - 1)));
        }
        else {
            return 1;
        }

    }
}
