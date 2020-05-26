package com.alsfirsova.calculator;

public class OperationAdditionImpl implements OperationInterface {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
