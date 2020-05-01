package com.alsfirsova.statics;


public class Car extends Vehicle implements ICar, ITransport {

    private static Car car;

    public Car(String name) {
        super(name);
    }

    @Override
    public void amountPassengers() {
        System.out.println(name + " вмещает в себя 5 человек");
    }

    public static void amountPassengersStatic() {
        car.amountPassengers();
    }

    @Override
    public void move() {
        System.out.println(name + " едет");
    }

    public static void moveStatic() {
        car.move();
    }

    static void initCar(String name) {
        car = new Car(name);
    }
    static Car getCar() {
        return car;
    }
}
