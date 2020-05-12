package com.alsfirsova.collections;

public class People {
    String name;
    int number;

    public People(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "People's name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        return ((People)obj).name.equals(name);
    }
}
