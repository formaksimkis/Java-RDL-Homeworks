package org.fundamentals.homework.example;

public interface HissSound extends Sound {
    String sound = "hss-s-s";

    @Override
    default String makeSound() {
        return sound;
    }
}
