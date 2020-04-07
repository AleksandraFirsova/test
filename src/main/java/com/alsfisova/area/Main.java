package com.alsfisova.area;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4, 5);
        Square square = new Square(4);
        Circle circle = new Circle(2.0);

        triangle.Area();
        triangle.Print();

        square.Area();
        square.Print();

        circle.Area();
        circle.Print();
    }
}
