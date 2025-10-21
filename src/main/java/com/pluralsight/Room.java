package com.pluralsight;

public class Room {
    private int beds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int beds, double price, boolean occupied, boolean dirty, boolean available) {
        this.beds = beds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getBeds() {
        return this.beds;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public boolean isAvailable() {
        return (!this.dirty && !this.occupied);
    }
}







