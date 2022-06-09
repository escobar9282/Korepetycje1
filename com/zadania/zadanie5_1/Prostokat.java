package com.zadania.zadanie5_1;

import java.util.Scanner;

public class Prostokat {
    int a, b;

    public Prostokat() {

    }

    public Prostokat(int a){
        this.a = a;
    }

    public Prostokat(int b, int a) {
        this.a = a;
        this.b = b;
    }

    public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
    }


    public int processTheData() {
        return a * b;
    }

    public int showScore() {
        return 2*a + 2*b;
    }
}
/*Napisz zgodnie z zasadami programowania obiektowego program,
        który oblicza pole prostokąta. Klasa powinna zawierać trzy metody:
        czytaj_dane() — metoda umożliwia wprowadzenie do programu długości
        boków a i b z klawiatury. W programie należy przyjąć, że a i b oraz
        zmienna pole są typu double (rzeczywistego).
        przetwórz_dane() — metoda oblicza pole prostokąta według wzoru pole = a*b .
        wyświetl_wynik() — metoda wyświetla długości boków a i b oraz wartość
        zmiennej pole w określonym formacie. Dla zmiennych a i b oraz pole należy
        przyjąć format wyświetlania ich na ekranie z dwoma miejscami po przecinku.*/