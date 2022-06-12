package com.zadania.zadanie5_2;

import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.forLanguageTag("en-GB"));
        QuadraticFunction quadraticFunction = new QuadraticFunction();
        quadraticFunction.loadData();
        quadraticFunction.convertData();
        quadraticFunction.showScore();
    }
}
    /*Napisz zgodnie z zasadami programowania obiektowego program,
        który oblicza pierwiastki równania kwadratowego ax2+by+c = 0
        z wykorzystaniem instrukcji wyboru switch ... case . Klasa powinna
        zawierać trzy metody:
        czytaj_dane() — metoda jest odpowiedzialna za wczytanie danych
        do programu oraz obsłużenie sytuacji, kiedy a = 0 . Zmienne a , b i c
        to liczby rzeczywiste wprowadzane z klawiatury.
        przetwórz_dane() — metoda odpowiada za wykonanie niezbędnych obliczeń.
        wyświetl_wynik() — metoda jest odpowiedzialna za wyświetlenie wyników
        na ekranie monitora. Dla zmiennych a , b , c , x1 oraz x2 należy przyjąć
        format wyświetlania ich z dwoma miejscami po przecinku.*/
