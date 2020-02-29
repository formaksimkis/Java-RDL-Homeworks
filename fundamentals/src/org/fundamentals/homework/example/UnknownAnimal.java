package org.fundamentals.homework.example;

public class UnknownAnimal extends Animal {
    private String name;
    private static final String action = "do something indefinite";
    private static final String sound = "indefinite sound";


    public UnknownAnimal(String name) {
        this.name = name;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    public String doAction() {
        return action;
    }

    @Override
    public String makeSound() {
        return sound;
    }
}
