package com.alsfirsova.calculator;

import com.alsfirsova.exceptions.DivisionException;
import com.alsfirsova.exceptions.MoreThan100Exception;

public interface OperationInterface {

     int doOperation(int num1, int num2) throws Exception;


}
