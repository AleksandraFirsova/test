package com.alsfirsova.finalexample;

import java.util.ArrayList;
import java.util.List;

public class Example {
    final static double PI = 3.14;
    final String color;
    final List<Object> list = new ArrayList<>();

    public Example(String color) {
        this.color = color;
    }

    public final void example(final String n) {
        final int x = 10;
        list.add("123");
        list = new ArrayList<>();
    }
}
