package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    // Test showing that a room can be checked into.

    @Test
    void checkIn() {
        //arrange
        Room room = new Room(2,150);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
    }

    // Test showing that a person can check out of a room.

    @Test
    void checkout() {
        //arrange
        Room room = new Room(2,150);

        //act
        room.checkout();

        //assert
        assertFalse(room.isOccupied());
    }

    // Test showing that a room cannot be cleaned if its occupied.

    @Test
    void cleanroom() {
        //arrange
        Room room = new Room(4,300);

        //act
        room.cleanroom();

        //assert
        assertTrue(room.isOccupied());
    }
}