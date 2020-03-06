package com.scottlogic.dp.introduction.harbour;

import com.scottlogic.dp.introduction.harbour.harbour.FishingShip;
import com.scottlogic.dp.introduction.harbour.harbour.Harbour;

public class HarbourInteraction {

    public void play() {
        FishingShip emptyFuelShip = new FishingShip();
        FishingShip halfFuelShip = new FishingShip();

        Harbour harbour = new Harbour();
        harbour.refill(emptyFuelShip);
        FishingShip firstRefilled = harbour.releaseShip();

        harbour.refill(halfFuelShip);
        FishingShip secondRefilled = harbour.releaseShip();

        System.out.println(firstRefilled.fuelLevel());
        System.out.println(secondRefilled.fuelLevel());
    }
}
