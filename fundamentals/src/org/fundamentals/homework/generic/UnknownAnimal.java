package org.fundamentals.homework.generic;

public class UnknownAnimal implements Action, Sound {
    static final String action = "does unknown action";
    static final String sound = "unknown sound";
    @Override
    public String doAction() {
       return action;
    }

    @Override
    public String makeSound() {
        return sound;
    }
}
