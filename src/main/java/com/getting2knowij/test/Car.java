package com.getting2knowij.test;

public class Car {
  private Coords position = new Coords(0, 0);

  void drive(int latitude, int longitude) {
    position = new Coords(position.getLatitude() + latitude, position.getLongitude() + longitude);
  }

  public Coords getPosition() {
    return position;
  }
}
