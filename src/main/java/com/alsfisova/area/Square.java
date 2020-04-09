package com.alsfisova.area;

public class Square extends Figures {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
        System.out.println("Вы поменяли длину стороны квадрата на " + a);
    }

    @Override
    public void Area() {
        result = a * a;
        System.out.println("Площадь квадрата: " + result);
    }
}
