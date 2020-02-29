package org.fundamentals.homework.generic;

public class Animal<P extends Action, T extends Sound> implements ObjectsWithActionAndSound {
    private String name;
    private P action;
    private T sound;

    public Animal(String name, P action, T sound) {
        this.name = name;
        this.action = action;
        this.sound = sound;
    }

    String getDescription() {
        return name + " " + action.doAction() + " and says " + sound.makeSound();
    }

    @Override
    public Object getActionParam() {
        return action;
    }

    @Override
    public Object getSoundParam() {
        return sound;
    }

    @Override
    public String toString() {
        return "Animal<" + action.getClass().getName() + "," + sound.getClass().getName() + ">";
    }
}
