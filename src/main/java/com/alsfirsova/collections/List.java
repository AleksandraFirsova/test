package com.alsfirsova.collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        List l = new List();

        for (String str : args) {
            System.out.println("Строка: " + str);
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            list.add(args[i].toUpperCase());
            System.out.println(list);
        }

        l.printAsString(list);
    }

    private void printAsString(ArrayList<String> list) {
        String string = String.join(",", list);
        System.out.println(string);
    }
}
