package com.company;

public class BusStop {
    private int id;
    private Bus name;
    private Driver driver;
    private State state;

    public BusStop(int id, Bus name, Driver driver, State state) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.state = state;
    }

    public BusStop() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus getName() {
        return name;
    }

    public void setName(Bus name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                " name: " + name +
                " driver: " + driver +
                " state: " + state;
    }
}
