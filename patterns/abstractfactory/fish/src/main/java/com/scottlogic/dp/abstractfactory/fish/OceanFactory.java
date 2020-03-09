package com.scottlogic.dp.abstractfactory.fish;

import com.scottlogic.dp.abstractfactory.fish.Fishies.*;

public class OceanFactory extends WaterEnvironmentFactory {

    public WaterEnvironment waterEnvironment(String name) {
        return new Ocean(name);
    }

    @Override
    public VeggieFish veggieFish(String name) {
        return new OceanVegieFish(name);
    }

    @Override
    public PredatorFish predatorFish(String name) {
        return new OceanPredatorFish(name);
    }
}
