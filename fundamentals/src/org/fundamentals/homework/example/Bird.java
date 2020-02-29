package org.fundamentals.homework.example;

public class Bird extends Animal implements FlyAction, ChirrupSound {
    static final String name = "bird";

    @Override
    protected String getName() {
        return name;
    }
}
