package com.alsfirsova.transport;

public class Main {
    public static void main(String[] args) {


            Vehicle t = createVehacle(args[0]);
            t.move();
            if (t instanceof Car) {
                ((Car) t).somethingMethod();
            }
    }

    private static Vehicle createVehacle(String arg) {
        if (arg.equals("car")) {
            Car car = new Car(arg, " 123");
            return car;
        } else if (arg.equals("plane")) {
            return new Plane(arg);
        } else {

            return null;
        }
    }
}
