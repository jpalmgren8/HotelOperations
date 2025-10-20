package com.pluralsight;

public class Room {
    private int beds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int beds, double price, boolean occupied, boolean dirty, boolean available) {
        this.beds = beds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }
}







