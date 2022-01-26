package com.company;

public class State {
String base;
    public State(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return base;
    }
}
