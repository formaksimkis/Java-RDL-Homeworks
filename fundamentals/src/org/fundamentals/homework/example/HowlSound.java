package org.fundamentals.homework.example;

public interface HowlSound extends Sound {
    String sound = "awoo-o-o";

    @Override
    default String makeSound() {
        return sound;
    }
}
