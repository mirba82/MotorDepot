package com.company;

public class BusStop1 {
    private int id;
    private Driver driver;
    private State state;
    private Bus bus;

    public BusStop1(int id,Bus bus, Driver driver, State state) {
        this.id = id;
        this.bus = bus;
        this.driver = driver;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                        bus+
                " driver: " + driver +
                " state: " + state;

    }
}
