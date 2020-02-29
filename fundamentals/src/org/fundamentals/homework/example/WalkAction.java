package org.fundamentals.homework.example;

public interface WalkAction extends Action {
    String action = "walks on four legs";
    @Override
    default String doAction() {
        return action;
    }
}
