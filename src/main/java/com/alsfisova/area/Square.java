package com.alsfisova.area;

public class Square extends Figures {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double Area() {
        result = a * a;
        return result;
    }

    @Override
    public void Print() {
        System.out.println("Площадь квадрата: " + result);
    }
}
