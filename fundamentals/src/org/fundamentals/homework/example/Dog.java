package org.fundamentals.homework.example;

public class Dog extends Animal implements WalkAction, BarkSound {
    static final String name = "dog";

    @Override
    protected String getName() {
        return name;
    }
}
