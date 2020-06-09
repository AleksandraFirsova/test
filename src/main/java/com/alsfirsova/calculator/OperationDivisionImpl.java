package com.alsfirsova.calculator;

import com.alsfirsova.exceptions.DivisionException;
import com.alsfirsova.exceptions.MoreThan100Exception;

public class OperationDivisionImpl implements OperationInterface {
    @Override
    public int doOperation(int num1, int num2) throws Exception {

        if (num1 > 100) {
            throw new MoreThan100Exception("Нельзя больше 100");
        } else if (num2 == 0) {
            throw new DivisionException("На ноль делить нельзя");
        } else {
            return num1 / num2;
        }
    }
}
