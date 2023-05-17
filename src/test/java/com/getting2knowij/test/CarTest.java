package com.getting2knowij.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldCreateCar() {
        Car car = new Car();
        assertNotNull(car);
    }

    @Test
    void shouldDriveForwardsWithNoOtherInstructions() {
        // given
        Car car = new Car();
        Coords oldPosition = car.getPosition();

        // when
        car.drive(1, 1);

        // then
        Coords newPosition = car.getPosition();
        assertNotEquals(oldPosition, newPosition);
    }

    @Test
    void shouldDriveForwardsInTheDirectionIndicated() {
        // given
        Car car = new Car();
        Coords oldPosition = car.getPosition();

        // when
        car.drive(1, 2);

        // then
        Coords newPosition = car.getPosition();
        assertEquals(oldPosition.getLatitude() + 1, newPosition.getLatitude());
        assertEquals(oldPosition.getLongitude() + 2, newPosition.getLongitude());
    }
}