package com.alsfirsova.interfaces;

//имплементация двух интерфейсов с одинаковыми методом + НЕ абстрактный класс с таким же методом
public class Plane implements IPlaneFirst, IPlaneSecond{

    public void move() {
        System.out.println("Plane move");
    }
}
