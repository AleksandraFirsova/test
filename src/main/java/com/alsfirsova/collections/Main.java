package com.alsfirsova.collections;

import java.util.*;
import java.util.List;

public class Main {
    static List<People> peopleCollection = new ArrayList<>();
    static Map<Integer, People> peopleMap = new HashMap<>();
    static Set<People> peopleSet= new HashSet<>();

    public static void main(String... args) {
        People people1 = new People("Vasya", 123);
        People people2 = new People("Oleg", 456);
        People people3 = new People("Vasya", 123);
        People people4 = people3;

       // addOnlyUniqPeople(people1, people2, people3, people4);
        peopleMap.put(people1.number, people1);
        peopleMap.put(people2.number, people2);
        peopleMap.put(people3.number, people3);
        peopleMap.put(people4.number, people4);

        //System.out.println(findPeople(123));
        System.out.println(peopleMap.get(2));

        //System.out.println(containsPeople(people3));
        System.out.println(peopleMap.containsValue(people3));

        System.out.println(peopleCollection.size());

        peopleMap.remove(3);

        System.out.println(peopleMap);

        System.out.println(peopleMap.containsKey(2));

        System.out.println(peopleMap.values());
        for (People people: peopleMap.values()) {
            System.out.println(people);
        }
        for (Map.Entry<Integer, People> entry : peopleMap.entrySet()) {
            if (entry.getKey() == 123) {
            System.out.println(entry.getValue());
            }
        }
        for (Integer key : peopleMap.keySet()) {
            System.out.println(key);
        }
    }

    @Deprecated
    public static People findPeople(int number) {
        for (People people : peopleCollection) {
            if (number == people.number) {
                return people;
            }
        }
        return null;
    }

    @Deprecated
    public static boolean containsPeople(People people) {
        return peopleCollection.contains(people);
    }

    @Deprecated
    public static void addOnlyUniqPeople(People... people) {
        for (People person : people) {
            if (findPeople(person.number) == null) {
                peopleCollection.add(person);
            }
        }
    }
}
