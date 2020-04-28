package com.alsfirsova.area;

public class Triangle extends Figures {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
        System.out.println("Вы поменяли длину первой стороны треугольника на " + a);
    }

    public void setB(double b) {
        this.b = b;
        System.out.println("Вы поменяли длину второй стороны треугольника на " + b);
    }

    public void setC(double c) {
        this.c = c;
        System.out.println("Вы поменяли длину третьей стороны треугольника на " + c);
    }

    @Override
    public void area() {
        result = Math.sqrt(a * a + b * b + c * c);
        System.out.println("Площадь треугольника: " + result);
    }

}
