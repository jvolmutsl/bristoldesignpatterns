package com.scottlogic.dp.abstractfactory.fish.Fishies;

import com.scottlogic.dp.abstractfactory.fish.WaterEnvironment;

public abstract class WaterEnvironmentFactory {

    public abstract WaterEnvironment waterEnvironment(String name);
    public abstract VeggieFish veggieFish(String name);

    public abstract PredatorFish predatorFish(String name);
    public abstract Snail snail();
}
