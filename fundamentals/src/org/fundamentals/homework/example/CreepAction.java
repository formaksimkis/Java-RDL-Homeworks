package org.fundamentals.homework.example;

public interface CreepAction extends Action{
    String action = "creeps quietly";
    @Override
    default String doAction() {
        return action;
    }
}
