package com.alsfirsova.transport;

public abstract class Vehicle {
    String name = initString();


    public Vehicle(String name) {
        this.name = name;
        System.out.println("Constructor Vehicle " + name);
    }

    public abstract void move();

    static String initString() {
        System.out.println("init field s in " + Vehicle.class.getName());
        return null;
    }
}
