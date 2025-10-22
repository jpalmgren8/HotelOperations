package com.pluralsight;

public class HotelApplication {
    public static void main(String[] args) throws InterruptedException {

        // Need to work on testing classes and methods
        // Setup scanners for taking in input for all the class info

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a punch in time: ");
//        double startTime = sc.nextDouble();
//
//        System.out.println("Enter a punch out time: ");
//        double endTime = sc.nextDouble();

        Employee e = new Employee(1,"Julian","Cleaner",15, 0);

        e.punchIn();

        // Thread sleep for 5 minutes to test a punch in and out
        // at the current time.
        Thread.sleep(300000);

        e.punchOut();

        System.out.println(e.getRegularHours());

    }
}
