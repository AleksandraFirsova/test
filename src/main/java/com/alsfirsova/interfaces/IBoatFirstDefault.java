package com.alsfirsova.interfaces;

public interface IBoatFirstDefault extends ITransport{
    @Override
    default void move() {
        System.out.println("Default method first");
    }
}
