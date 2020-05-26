package com.alsfirsova.calculator;

public enum Operation {
    ADDITION('+', "Сложение", new OperationAdditionImpl()), //реализация интерфейса OperationInterface
    SUBTRACTION('-', "Вычитание", new OperationSubtractionImpl()),
    MULTIPLICATION('*', "Умножение", new OperationMultiplicationImpl()),
    DIVISION('/', "Деление", new OperationDivisionImpl());

    public final Character operationSymbol;
    public final String localName;
    public final OperationInterface handler; //В нем метод doOperation, который принимает два инта и возвращает результат

    Operation(Character operationSymbol, String localName, OperationInterface handler) {
        this.operationSymbol = operationSymbol;
        this.localName = localName;
        this.handler = handler;
    }

    public static Operation getByOperationSymbol(Character operationSymbol) {
        for (Operation operation : Operation.values()) {
            if (operationSymbol.equals(operation.operationSymbol)) {
                return operation;
            }
        }

        return null;
    }
}











