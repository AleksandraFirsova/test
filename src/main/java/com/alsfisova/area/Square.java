package com.alsfisova.area;

public class Square extends Figures {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
        System.out.println("Вы поменяли длину стороны квадрата на " + a);
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
