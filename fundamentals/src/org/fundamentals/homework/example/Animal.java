package org.fundamentals.homework.example;

public abstract class Animal implements Action, Sound {
    protected abstract String getName();
    String getDescription() {
        return getName() + " " + doAction() + " and says " + makeSound();
    }
}
