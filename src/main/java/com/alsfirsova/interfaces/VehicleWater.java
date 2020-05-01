package com.alsfirsova.interfaces;

//имплементация двух интерфейсов с одинаковыми методом + абстрактный класс с таким же методом
public abstract class VehicleWater implements IVehicleFirst, IVehicleSecond{
    public abstract void move();
}
