package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {

        return roomType;

    }

    public double getPrice() {

        if (roomType.equals("King") || roomType.equals("king")) {
            price = 139.00;
        } else if (roomType.equals("Double") || roomType.equals("double")) {
            price = 124.00;
        } else {
            System.out.println("Incorrect room type, please try again");
        }

        if (weekend) {
            price = price + (price * 0.10);
        }

        price = price * numberOfNights;

        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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
