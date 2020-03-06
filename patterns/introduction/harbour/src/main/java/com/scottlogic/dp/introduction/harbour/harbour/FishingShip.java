package com.scottlogic.dp.introduction.harbour.harbour;

public class FishingShip {

    private static int MAX_FUEL = 50;
    private int currentFuelLevel = 50;

    public void refil() {
        currentFuelLevel = MAX_FUEL;
    }

    public int fuelLevel() {
        return currentFuelLevel;
    }
}
