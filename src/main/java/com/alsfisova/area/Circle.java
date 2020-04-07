package com.alsfisova.area;

public class Circle extends Figures {
    private double r;
    final double p = Math.PI;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double Area() {
        result = p * r * r;
        return result;
    }

    @Override
    public void Print() {
        System.out.println("Площадь круга: " + result);
    }
}

