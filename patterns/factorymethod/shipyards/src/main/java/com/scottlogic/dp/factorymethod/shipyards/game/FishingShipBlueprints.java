package com.scottlogic.dp.factorymethod.shipyards.game;

public class FishingShipBlueprints {

    private final static int REQUIRED_CREW_SIZE = 2;

    public FishingBarge fishingShip(Crew crew) {
        if(checkCrew(crew)) {
            return new FishingBarge(crew);
        } else {
            throw new IllegalArgumentException(String.format("Operating this fishing barge in less than %d is not advised", REQUIRED_CREW_SIZE));
        }
    }

    public MaterialRequirements materialNeeded() {
        return new MaterialRequirements(10, 1, 2);
    }

    public int crewNeeded() {
        return REQUIRED_CREW_SIZE;
    }

    public String shipType() {
        return "Fishing barge";
    }

    private boolean checkCrew(Crew crew) {
        return crew.members().stream().allMatch(member -> member.age() > REQUIRED_CREW_SIZE);
    }
}
