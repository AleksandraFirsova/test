package com.alsfirsova.transport;

public class Car extends Vehicle{

    String s = initString();

    public Car(String name, String s) {
        super(name);
        System.out.println("Вызван конструктор класса-наследника: " + name);
        this.s = s;
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void amountPassengers() {
        System.out.println(name + " вмещает в себя 5 человек");
    }

    public void somethingMethod() {
        System.out.println("Метод класса Car");
    }

    static String initString() {
        System.out.println("init field s in " + Car.class.getName());
        return null;
    }
}
