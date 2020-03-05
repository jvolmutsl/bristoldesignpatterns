package com.scottlogic.dp.factorymethod.shipyards.game;

public class Shipyard {
    private int wood = 100;
    private int metal = 100;
    private int cloth = 100;
    private int crewManAvailable = 10;

    private final FishingShipBlueprints blueprints = new FishingShipBlueprints();

    FishingBarge constructShip() {
        MaterialRequirements requirements = blueprints.materialNeeded();
        updateMaterials(requirements);

        Crew crew = createCrewForBlueprint();
        FishingBarge ship = blueprints.fishingShip(crew);
        return ship;
    }

    public String showOffer() {
        return String.format("We can create [%s]", blueprints.shipType());
    }

    private void updateMaterials(MaterialRequirements requirements) {
        // Not implemented yet
    }

    private Crew createCrewForBlueprint() {
        blueprints.crewNeeded();
        return new Crew(new CrewMember("Juana", 25), new CrewMember("Pablo", 24));
    }
}
