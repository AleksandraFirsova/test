package com.alsfirsova.calculator;

import com.alsfirsova.exceptions.DivisionException;
import com.alsfirsova.exceptions.MoreThan100Exception;

import java.sql.SQLException;
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
        Operation operationInput = null;
        if (scan.hasNext()) {
            operationInput = Operation.getByOperationSymbol(scan.next().charAt(0));
            if (operationInput == null) {
                System.out.println("Вы ввели некорректную операцию");
                operationInput = getOperationFromConsole();
            }
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

    public static class Connection implements AutoCloseable{
        public void connect() {

        }

        public void disconnect() {

        }

        public void doSomething() throws SQLException {

        }

        @Override
        public void close() throws Exception {
            disconnect();
        }
    }

    public static int example() {
        try(Connection connection = new Connection()) {
            connection.connect();
            connection.doSomething();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static void main(String[] args) {
        boolean isExceptionPresent;


        do {
            int num1 = getNumber();
            int num2 = getNumber();
            Operation operationInput = getOperationFromConsole();

            int result = 0;

            try {
                result = operationInput.handler.doOperation(num1, num2);
                isExceptionPresent = false;
                Main.checkAndPrint(operationInput);
                calcMap.put(operationInput, result);
                System.out.println("Результат операции " + operationInput.localName + " : " + result);

            } catch (Exception e) {
                isExceptionPresent = true;
                System.out.println(e.getMessage());
            }
        } while (isExceptionPresent);
    }
}
