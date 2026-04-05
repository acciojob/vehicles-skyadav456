package com.driver;

public class Boat extends Vehicle {
    private int capacity;

    public Boat(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return getName();
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}