package com.alsfirsova.area;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setR(double radius) {
        this.radius = radius;
        System.out.println("Вы поменяли радиус круга на " + radius);
    }

    @Override
    public void area() {
        result = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.println("Площадь круга: " + result);
    }
}

