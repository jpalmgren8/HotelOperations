package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
       //arrange
       Employee employee = new Employee(1,"Hank","Manager",35.00,0);

       //act
       employee.punchIn();

       //assert

    }

    @Test
    void punchOut() {
        //arrange
        Employee employee = new Employee(2,"Dale","Cleaner",20.00,0);

        //act
        employee.punchOut();

        //assert

    }
}