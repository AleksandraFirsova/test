package com.alsfirsova.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<People> peopleCollection = new ArrayList<>();

    public static void main(String[] args) {
        People people1 = new People("Vasya", 123);
        People people2 = new People("Oleg", 456);
        People people3 = new People("Vasya", 123);

        peopleCollection.add(people1);
        peopleCollection.add(people2);

        System.out.println(findPeople(123));
        System.out.println(containsPeople(people3));
    }

    public static People findPeople(int number) {
        for (People people : peopleCollection) {
            if (number == people.number) {
                return people;
            }
        }
        return null;
    }

    public static boolean containsPeople(People people) {
        return peopleCollection.contains(people);
    }
}
