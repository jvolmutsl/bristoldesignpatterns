package com.scottlogic.dp.abstractfactory.fish;

import com.scottlogic.dp.abstractfactory.fish.Fishies.PredatorFish;
import com.scottlogic.dp.abstractfactory.fish.Fishies.VeggieFish;
import com.scottlogic.dp.abstractfactory.fish.Fishies.WaterEnvironmentFactory;

public class EnvironmentGenerator {

    private WaterEnvironmentFactory factory;
    private String name;

    public EnvironmentGenerator(WaterEnvironmentFactory factory, String name) {
        this.factory = factory;
        this.name = name;
    }

    public void generate() {
        WaterEnvironment environment = factory.waterEnvironment(name);
        VeggieFish fran = factory.veggieFish("Fran");
        VeggieFish tilly = factory.veggieFish("Tilly");
        PredatorFish jess = factory.predatorFish("Jess");
        environment.add(fran);
        environment.add(tilly);
        environment.addPredatorFish(jess);
    }
}
