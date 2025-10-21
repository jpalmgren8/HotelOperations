package com.pluralsight;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        // Need to work on testing classes and methods
        // Setup scanners for taking in input for all the class info

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a punch in time: ");
        double startTime = sc.nextDouble();

        System.out.println("Enter a punch out time: ");
        double endTime = sc.nextDouble();

        Employee e = new Employee(1,"Julian","Cleaner",15, 0);

        e.punchIn(startTime);
        e.punchOut(endTime);

        System.out.println(e.getRegularHours());

    }
}
