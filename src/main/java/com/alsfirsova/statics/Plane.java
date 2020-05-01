package com.alsfirsova.statics;

public class Plane extends Vehicle implements ICar, ITransport {
    private static Plane plane;

    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " летит");
    }

    @Override
    public void amountPassengers() {
        System.out.println(name + " вмещает в себя 500 человек");
    }

    static void amountPassengersStatic() {
        plane.amountPassengers();
    }

    static void moveStatic() {
        plane.move();
    }

    static void initPlane(String name) {
        plane = new Plane(name);
    }
    static Plane getPlane() {
        return plane;
    }
}
