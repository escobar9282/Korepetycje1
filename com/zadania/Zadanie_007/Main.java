package com.zadania.Zadanie_007;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String text = "Każda stwora ma swojego amatora";

        System.out.println(Main.longestWord("Kot ma ale"));
        System.out.println(Main.longestWord("Duda to frajer"));
        System.out.println(Main.longestWord("Kaczyński to ja"));
        System.out.println(Main.longestWord("Sky is violet"));

    }
    static String longestWord(String example){
        String longest = Arrays.stream(example.split(" "))
                .max(Comparator.comparing(String::length))
                .orElse(null);
        return longest;
    }
}
//    Znajdź najdłuższy wyraz w podanym tekście np. Ala ma kota -> kota