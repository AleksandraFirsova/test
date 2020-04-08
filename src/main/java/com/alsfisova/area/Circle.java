package com.alsfisova.area;

public class Circle extends Figures {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
        System.out.println("Вы поменяли радиус круга на " + r);
    }

    @Override
    public double Area() {
        result = Math.round(Math.PI * Math.pow(r, 2));
        return result;
    }

    @Override
    public void Print() {
        System.out.println("Площадь круга: " + result);
    }
}

