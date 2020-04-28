package com.alsfirsova.transport;

public class Car extends Vehicle {

    String s= initString();

    public Car(String name, String s) {

        super(name);
        System.out.println("Constructor Car " + name);
        this.s = s;

    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("drive");

    }

    static String initString() {
        System.out.println("init field s in " + Car.class.getName());
        return null;
    }

    public void somethingMethod() {
        System.out.println("frr");
    }
}
