package com.alsfirsova.calculator;

public class OperationSubtractionImpl implements OperationInterface {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
