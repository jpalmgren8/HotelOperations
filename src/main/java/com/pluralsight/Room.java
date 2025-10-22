package com.pluralsight;

public class Room {
    private int beds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int beds, double price) {
        this.beds = beds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
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

    public void checkIn () {

        this.occupied = true;
        this.dirty = true;

    }

    public void checkout () {

        this.occupied = false;

    }

    public void cleanroom () {
        this.dirty = false;
    }
}







