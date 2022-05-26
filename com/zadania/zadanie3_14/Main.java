package com.zadania.zadanie3_14;

public class Main {
    public static void main(String[] args) {
        int I = 1;
        int suma = 0;
        do {
            if (I % 2 == 1){
                suma = suma + I;
            }
            I++;
        }while (100 >= I);
        System.out.println(suma);
    }
}
