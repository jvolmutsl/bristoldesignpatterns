package com.scottlogic.dp.abstractfactory.fish;

import com.scottlogic.dp.abstractfactory.fish.Fishies.*;

public class PondFactory extends WaterEnvironmentFactory {

    public WaterEnvironment waterEnvironment(String name) {
        return new Pond(name);
    }

    @Override
    public VeggieFish veggieFish(String name) {
        return new PondVegieFish(name);
    }

    @Override
    public PredatorFish predatorFish(String name) {
        return new PondPredatorFish(name);
    }
}
