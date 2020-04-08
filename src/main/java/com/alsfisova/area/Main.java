package com.alsfisova.area;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4, 5);
        Square square = new Square(4);
        Circle circle = new Circle(2.0);

        triangle.setA(5);
        triangle.setB(6);
        triangle.setC(7);
        triangle.Area();
        triangle.Print();
        System.out.println(" ");

        square.setA(8);
        square.Area();
        square.Print();
        System.out.println(" ");

        circle.setR(4);
        circle.Area();
        circle.Print();
    }
}
