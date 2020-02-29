package org.fundamentals.homework.example;

public interface ChirrupSound extends Sound {
    String sound = "chirrik-chik-chik";

    @Override
    default String makeSound() {
        return sound;
    }
}
