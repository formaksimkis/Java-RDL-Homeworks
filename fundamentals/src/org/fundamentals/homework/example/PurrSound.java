package org.fundamentals.homework.example;

public interface PurrSound extends Sound {
    String sound = "mhr-r-r";

    @Override
    default String makeSound() {
        return sound;
    }
}
