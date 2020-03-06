package com.scottlogic.dp.introduction.harbour.harbour;

public class Harbour {

    private FishingShip currentlyServedShip;

    public void refill(FishingShip ship) {
        if(currentlyServedShip == null) {
            currentlyServedShip = ship;

        } else {
            throw new IllegalStateException("Currently serving a ship");
        }
    }

    public FishingShip releaseShip() {
        currentlyServedShip = null;
        return currentlyServedShip;
    }
}
