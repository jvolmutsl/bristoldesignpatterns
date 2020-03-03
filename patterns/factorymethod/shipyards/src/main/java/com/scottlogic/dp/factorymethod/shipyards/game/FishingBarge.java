package com.scottlogic.dp.factorymethod.shipyards.game;

public class FishingBarge {

    private final int MAX_SPEED = 50;
    private State state = State.DRIFTING;

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
