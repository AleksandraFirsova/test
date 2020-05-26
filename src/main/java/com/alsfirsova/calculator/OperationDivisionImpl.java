package com.alsfirsova.calculator;

public class OperationDivisionImpl implements OperationInterface {
    @Override
    public int doOperation(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Знаменатель не может быть равен нулю");
        }
        return 0;
    }
}
