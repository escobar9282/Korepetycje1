package com.zadania.Zadanie_006;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.ifIsPalindrome("kajak"));
        System.out.println(Main.ifIsPalindrome("ala"));
        System.out.println(Main.ifIsPalindrome("auto"));
    }
    public static boolean ifIsPalindrome(String st){
        StringBuilder string = new StringBuilder(st);
        string.reverse();
        String rev = string.toString();
        if (st.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}
//    Sprawdź czy podany wyraz jest palidromem czytany od przodu i od tyłu jest taki sam np. kajak, ala, oko