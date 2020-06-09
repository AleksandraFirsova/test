package com.alsfirsova.exceptions;

public class Main {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        try {
            doOperation(2,0);
        } catch (DivisionException e) {
            e.printStackTrace();
        }
    }
    static int doOperation(int num1, int num2) throws DivisionException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new DivisionException("На ноль делить нельзя");
        }
    }
}
