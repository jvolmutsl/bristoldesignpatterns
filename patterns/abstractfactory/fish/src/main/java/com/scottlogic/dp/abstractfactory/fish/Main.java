package com.scottlogic.dp.abstractfactory.fish;

import com.scottlogic.dp.abstractfactory.fish.Fishies.RiverFactory;
import com.scottlogic.dp.abstractfactory.fish.Fishies.WaterEnvironmentFactory;

public class Main {

    public static void main(String... args) {
        WaterEnvironmentFactory factory = new PondFactory();
        WaterEnvironmentFactory factory2 = new OceanFactory();
        WaterEnvironmentFactory factory3 = new RiverFactory();
        EnvironmentGenerator generator = new EnvironmentGenerator(factory, "Jan's Pond");
        EnvironmentGenerator generator2 = new EnvironmentGenerator(factory2, "Jan's Ocean");
        EnvironmentGenerator generator3 = new EnvironmentGenerator(factory3, "Tom's river");

//        generator.generate();
//        generator2.generate();
        generator3.generate();
    }
}
