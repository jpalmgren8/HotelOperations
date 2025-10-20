package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {

        double totalPay = 0;

        if (getOvertimeHours() > 0) {
            totalPay = (hoursWorked * payRate) + (getOvertimeHours() * (payRate * 1.5));
        } else {
            totalPay = getRegularHours() * payRate;
        }

        return totalPay;
    }

    public double getRegularHours() {

        double regularHours = 0;

        if (hoursWorked <= 40) {
            regularHours = hoursWorked;
        }

        return regularHours;
    }

    public double getOvertimeHours() {

        double overtimeHours = 0;

        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - getRegularHours();
        } else {
            return overtimeHours;
        }

        return overtimeHours;
    }
}
