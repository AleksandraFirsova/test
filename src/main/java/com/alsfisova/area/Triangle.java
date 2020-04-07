package com.alsfisova.area;

public class Triangle extends Figures {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Area() {
        result = Math.sqrt(a * a + b * b + c * c);
        return result;
    }

    @Override
    public void Print() {
        System.out.println("Площадь треугольника: " + result);
    }
}
