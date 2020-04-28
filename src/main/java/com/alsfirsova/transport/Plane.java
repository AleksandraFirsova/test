package com.alsfirsova.transport;

public class Plane extends Vehicle {

    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("fly");

    }
}
