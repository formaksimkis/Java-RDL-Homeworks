package org.fundamentals.homework.example;

public class Wolf extends Animal implements WalkAction, HowlSound {
    static final String name = "wolf";
    @Override
    protected String getName() {
        return name;
    }
}
