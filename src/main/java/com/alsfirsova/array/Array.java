package com.alsfirsova.array;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                System.out.println("Последний элемент массива");
            } else if (array[i] > array[i + 1]) {
                System.out.println("Элемент массива " + array[i] + " больше " + array[i + 1]);
            } else if (array[i] < array[i + 1]) {
                System.out.println("Элемент массива " + array[i] + " меньше " + array[i + 1]);
            } else {
                System.out.println("Элементы массива равны");
            }
        }
    }
}
