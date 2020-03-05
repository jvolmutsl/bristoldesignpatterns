package com.scottlogic.dp.factorymethod.shipyards.game;

public class FishingBarge {

    private final int MAX_SPEED = 50;
    private State state = State.DRIFTING;
    private Crew crew;

    public FishingBarge(Crew crew) {
        if(crew.members().size() < 2) {
            throw new IllegalArgumentException("Not enough crew members");
        }
        this.crew = crew;
    }

    public int cargoSize() {
        return 20;
    }

    public void goFishing() {
        state = State.FISHING;
        System.out.println("Going fishing");
    }

    public void sail(){
        state = State.SAILING;
    }

    public void stop() {
        state = State.SAILING;
    }

    enum State {
        DRIFTING, FISHING, SAILING
    }
}
