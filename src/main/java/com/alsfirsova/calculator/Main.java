package com.alsfirsova.calculator;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Map<Operation, Integer> calcMap = new HashMap<>();

    public static int getNumber() {
        System.out.println("Введите целое число: ");
        int number;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            System.out.println("Вы ввели некорректное число");
            scan.next();
            number = getNumber();
        }
        return number;
    }

    public static Operation getOperationFromConsole() {
        System.out.println("Введите операцию (+, -, *, /): ");
         Operation operationInput;
        if (scan.hasNext()) {
            operationInput = Operation.getByOperationSymbol(scan.next().charAt(0));

        } else {
            System.out.println("Вы ввели некорректную операцию");
            scan.next();
            operationInput = getOperationFromConsole();
        }
        return operationInput;
    }

    public static void checkAndPrint(Operation operation) {
        if (!calcMap.containsKey(operation)) {
            System.out.println("Предыдущая операция не найдена");
            return;
        }
        System.out.println("Результат предыдущей операции: " + calcMap.get(operation));
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            int num1 = getNumber();
            int num2 = getNumber();
            Operation operationInput = getOperationFromConsole();

            int result = operationInput.handler.doOperation(num1, num2);
            Main.checkAndPrint(operationInput);
                calcMap.put(operationInput, result);
                System.out.println("Результат операции " + operationInput.localName + " : " + result);
        }
    }
}
