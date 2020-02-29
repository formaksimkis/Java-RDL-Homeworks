package org.fundamentals.homework.example;

public interface FlyAction extends Action {
    String action = "flies by wings";

    @Override
    default String doAction() {
        return action;
    }
}
