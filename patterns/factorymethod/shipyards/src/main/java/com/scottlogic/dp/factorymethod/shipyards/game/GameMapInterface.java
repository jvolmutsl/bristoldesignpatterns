package com.scottlogic.dp.factorymethod.shipyards.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameMapInterface {
    private Map<String, Shipyard> shipyards = new HashMap<>();
    private List<FishingBarge> fishingFleet = new ArrayList<>();

    /**
     * We create two default shipyards
     */
    public GameMapInterface() {
        shipyards.put("A", new Shipyard());
        shipyards.put("B", new Shipyard());
    }

    public void createShip(Shipyard shipyard) {
        FishingBarge ship = shipyard.constructShip();
        fishingFleet.add(ship);
    }

    public Shipyard selectShipyard(String name) {
        if(shipyards.containsKey(name)) {
            return shipyards.get(name);
        } else {
            throw new IllegalArgumentException("Unknown shipyard name");
        }
    }

    public void commandFleetToFish() {
        fishingFleet.forEach(FishingBarge::goFishing);
    }
}
