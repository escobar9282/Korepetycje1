package com.zadania.zadanie_004;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Kowalski");
        stringList.add("Gilik");
        stringList.add("Gilik");
        stringList.add("Leszczyński");
        stringList.add("Groszewki");
        stringList.add("Groszewki");
        stringList.add("Bartoszewski");
        stringList.add("Komorowski");
        stringList.add("Komorowski");
        stringList.add("Duda");

        System.out.println(stringList);
        List<String> stringListWithoutDuplicates = stringList.stream().distinct().collect(Collectors.toList());
        System.out.println(stringListWithoutDuplicates);
    }
}
//    Jak usunąć za pomocą jednego przejścia po liście wszystkie duplikaty, napisz stosowny program