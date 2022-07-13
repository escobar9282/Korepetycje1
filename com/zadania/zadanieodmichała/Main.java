package com.zadania.zadanieodmichała;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new BigDecimal(358901.90324), new BigDecimal(432.90345809));
        rectangle.area();
        rectangle.circuit();
        System.out.println(rectangle.area());
        System.out.println(rectangle.circuit());
    }
}
