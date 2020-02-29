package org.fundamentals.homework.example;

public class Dolphin extends Animal implements SwimAction, SqueakSound {
    static final String name = "dolphin";

    @Override
    protected String getName() {
        return name;
    }
}
