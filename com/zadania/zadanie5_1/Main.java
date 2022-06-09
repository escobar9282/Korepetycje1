package com.zadania.zadanie5_1;

public class Main {
    public static void main(String[] args) {
        Prostokat ab = new Prostokat();
        ab.readData();
        System.out.println(ab.showScore());
        System.out.println(ab.processTheData());
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
