package org.fundamentals.homework.example;

public class Snake extends Animal implements CreepAction, HissSound {
    static final String name = "snake";

    @Override
    protected String getName() {
        return name;
    }
}
