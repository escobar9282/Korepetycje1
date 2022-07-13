package com.zadania.powtórki;

public class RandomMethodRerun {
    public static void main(String[] args) {
        int someGivenNumber = 123;
        boolean result = isItBig(someGivenNumber, 123);
    }

    private static boolean isItBig(int someGivenNumber, int i) {
        return someGivenNumber > 100;
    }
    
}
