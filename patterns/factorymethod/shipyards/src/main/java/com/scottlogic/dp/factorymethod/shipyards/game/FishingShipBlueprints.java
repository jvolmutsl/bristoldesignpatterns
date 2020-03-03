package com.scottlogic.dp.factorymethod.shipyards.game;

public class FishingShipBlueprints {

    public FishingBarge fishingShip(Material material) {
        if(isMaterialSatisfactory(material)) {
            return new FishingBarge();
        } else {
            throw new IllegalArgumentException("Insufficient material");
        }
    }

    public MaterialRequirements materialNeeded() {
        return new MaterialRequirements(10, 1, 2);
    }

    public String shipType() {
        return "Fishing barge";
    }

    private boolean isMaterialSatisfactory(Material material) {
        //Shorthand - always is.
        //Fixme: Implement
        return true;
    }
}
