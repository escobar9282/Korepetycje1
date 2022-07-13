package com.zadania.zadanieodmichała;

import java.math.BigDecimal;

public class Rectangle extends Shape {
    private BigDecimal a;
    private BigDecimal b;

public Rectangle(BigDecimal a, BigDecimal b){
    this.a = a;
    this.b = b;
}

    @Override
    public BigDecimal area() {
        return a.multiply(b);
    }
    @Override
    public BigDecimal circuit() {
    return ( a.multiply(new BigDecimal(2 )).add(b.multiply(new BigDecimal(2))));
    }
}
