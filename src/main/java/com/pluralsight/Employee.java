package com.pluralsight;

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

    public void punchOut (double time) {

        this.hoursWorked += (time - this.startTime);

        this.startTime = 0;

    }

}
