package com.alsfirsova.interfaces;

public interface IBoatSecondDefault extends ITransport{
    @Override
    default void move() {
        System.out.println("Default method second");
    }
}
