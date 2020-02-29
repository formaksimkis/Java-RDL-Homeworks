package org.fundamentals.homework.example;

public interface SwimAction extends Action {
    String action = "swims by using the fins";

    @Override
    default String doAction() {
        return action;
    }
}
