package com.company;

public class Driver {
    private int id;
    private String name;

    public Driver() {
    }

    public Driver( String name) {

        this.name = name;
    }

    @Override

    public String toString() {
        return " | "+ name+" | ";
    }
}
