package com.alsfirsova.transport;

public abstract class Vehicle {
    String name = initString();

    public Vehicle(String name) {
        this.name = name;
        System.out.println("Вызван конструктор супер класса: " + name);
    }

    public abstract void amountPassengers();

    static String initString() {
        System.out.println("init field s in " + Vehicle.class.getName());
        return null;
    }
}
