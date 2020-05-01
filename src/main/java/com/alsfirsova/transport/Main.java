package com.alsfirsova.transport;

public class Main {
    public static void main(String[] args) {

        Vehicle t = createVehacle(args[0]);
        t.amountPassengers();
        if (t instanceof Car) {
            ((Car) t).somethingMethod();
        }
    }

    private static Vehicle createVehacle(String arg) {
        if (arg.equals("Машина")) {
            Car car = new Car(arg, " string");
            return car;

        } else if (arg.equals("Самолет")) {
            return new Plane(arg);
        } else {
            return null;
        }
    }
}
