package com.alsfirsova.interfaces;

public class Main {
    public static void main(String[] args) {
        ITransport t = getTransport(args[0]);
        t.move();
        ICarFirst.iMove();
        if (t instanceof Car) {
            ((Car) t).brake();

        }

    }
    private static ITransport getTransport(String arg) {
        if (arg.equals("Car")) {
            return new Car();
        }
        else if (arg.equals("Plane")) {
            return new Plane();
        }
        else if (arg.equals("Boat")) {
            return new Boat();
        }
        else {
            return null;
        }
    }
}
