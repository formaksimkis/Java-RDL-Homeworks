package org.fundamentals.homework.example;

public interface SqueakSound extends Sound {
    String sound = "sque-q-q-q";

    @Override
    default String makeSound() {
        return sound;
    }
}
