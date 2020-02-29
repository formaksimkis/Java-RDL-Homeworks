package org.fundamentals.homework.example;

public class Cat extends Animal implements WalkAction, PurrSound {
    static final String name = "cat";

    @Override
    protected String getName() {
        return name;
    }
}
