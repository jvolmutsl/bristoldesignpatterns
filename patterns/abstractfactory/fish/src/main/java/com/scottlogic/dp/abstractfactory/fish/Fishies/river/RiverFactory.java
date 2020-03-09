package com.scottlogic.dp.abstractfactory.fish.Fishies.river;

import com.scottlogic.dp.abstractfactory.fish.Fishies.PredatorFish;
import com.scottlogic.dp.abstractfactory.fish.Fishies.River;
import com.scottlogic.dp.abstractfactory.fish.Fishies.VeggieFish;
import com.scottlogic.dp.abstractfactory.fish.Fishies.WaterEnvironmentFactory;
import com.scottlogic.dp.abstractfactory.fish.WaterEnvironment;

public class RiverFactory extends WaterEnvironmentFactory {

    @Override
    public WaterEnvironment waterEnvironment(String name) {
        return new River(name);
    }

    @Override
    public VeggieFish veggieFish(String name) {
        return new RiverVeggieFish(name);
    }

    @Override
    public PredatorFish predatorFish(String name) {
        return new RiverPredatorFish(name);
    }
}
