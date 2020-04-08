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

    public void setA(int a) {
        this.a = a;
        System.out.println("Вы поменяли длину первой стороны треугольника на " + a);
    }

    public void setB(int b) {
        this.b = b;
        System.out.println("Вы поменяли длину второй стороны треугольника на " + b);
    }

    public void setC(int c) {
        this.c = c;
        System.out.println("Вы поменяли длину третьей стороны треугольника на " + c);
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
