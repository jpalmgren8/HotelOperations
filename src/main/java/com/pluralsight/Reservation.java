package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType.trim();

        if (roomType.toLowerCase().equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {

        return roomType;

    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public double getReservationTotal() {
        double weekendCharge = this.price;

        if (this.weekend) {
            weekendCharge *= 1.1;
        }

        return this.numberOfNights * weekendCharge;

    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.trim();

        if (roomType.toLowerCase().equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
