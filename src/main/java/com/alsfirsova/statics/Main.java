package com.alsfirsova.statics;


public class Main {
    public static void main(String[] args) {


        Vehicle t = createVehacle(args[0]);

        if (t instanceof Car) {
            Car.amountPassengersStatic();
            Car.moveStatic();

        }

        if (t instanceof Plane) {
            Plane.amountPassengersStatic();
            Plane.moveStatic();
        }

    }

    private static Vehicle createVehacle(String arg) {
        if (arg.equals("Машина")) {
            Car.initCar(arg);

            return Car.getCar();

        }

        if (arg.equals("Самолет")) {
            Plane.initPlane(arg);
            return Plane.getPlane();
        }

        return null;
    }
}
