package org.fundamentals.homework.example;

public interface BarkSound extends Sound {
    String sound = "Haf-haf";

    @Override
    default String makeSound() {
        return sound;
    }
}
