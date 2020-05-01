package com.alsfirsova.interfaces;

//имплементация двух интерфейсов с одинаковыми методом
public class Car extends Cars implements ICarFirst, ICarSecond{
    @Override
    public void brake() {
        super.brake();
        System.out.println("Car brake in class Car");
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }
}
