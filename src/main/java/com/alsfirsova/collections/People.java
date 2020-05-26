package com.alsfirsova.collections;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return number == people.number &&
                Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
//Два одинаковых объекта должны иметь одинаковый hash code (по умолчанию не работает)
//Два одинаковых хэш кода не означают, что они получены из двух одинаковых объектов (коллизия)
//Два разных объекта должны иметь разные хэш коды (по умолчанию работает, но п.1)