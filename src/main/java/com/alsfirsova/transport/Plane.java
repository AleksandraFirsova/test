package com.alsfirsova.transport;

public class Plane extends Vehicle {

    public Plane(String name) {
        super(name);
    }

    @Override
    public void amountPassengers() {
        System.out.println(name + " вмещает в себя 500 человек");
    }
}
