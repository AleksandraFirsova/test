package com.alsfirsova.interfaces;

//имплементация двух интерфейсов с default одинаковыми методом + НЕ  абстрактный класс с таким же методом
public class Boat extends VehicleWater implements IBoatFirstDefault, IBoatSecondDefault {
    @Override
    public void move() {
        System.out.println("Boat move");
    }
}
