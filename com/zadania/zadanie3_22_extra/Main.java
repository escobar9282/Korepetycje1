package com.zadania.zadanie3_22_extra;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++) {
            String j= Integer.toHexString(i);
            System.out.print(j);
            System.out.print(" ");
            System.out.println((char)i);

        }
    }
}
