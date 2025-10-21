package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {

        double regularPay = this.payRate * this.getRegularHours();
        double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours();

        return regularPay + overtimePay;

    }

    public double getRegularHours() {

        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }

    }

    public double getOvertimeHours() {

        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchIn (double time) {

        this.startTime = time;

    }

    public void punchIn () {

        LocalTime time = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        String formattedTime = time.format(timeFormatter);
        String [] timeParts = formattedTime.split(":");

        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Converting to hour format for calculation
        minutes = minutes / 60;

        hours = hours + minutes;

        this.startTime = hours;


    }

    public void punchOut (double time) {

        this.hoursWorked += (time - this.startTime);

        this.startTime = 0;

    }

    public void punchOut () {

        LocalTime time = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        String formattedTime = time.format(timeFormatter);
        String [] timeParts = formattedTime.split(":");

        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        minutes = minutes / 60;

        hours = hours + minutes;

        this.hoursWorked += (hours - this.startTime);

        this.startTime = 0;

    }

}
