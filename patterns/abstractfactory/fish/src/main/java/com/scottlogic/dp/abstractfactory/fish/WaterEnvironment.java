package com.scottlogic.dp.abstractfactory.fish;

import com.scottlogic.dp.abstractfactory.fish.Fishies.PredatorFish;
import com.scottlogic.dp.abstractfactory.fish.Fishies.Snail;
import com.scottlogic.dp.abstractfactory.fish.Fishies.VeggieFish;

public abstract class WaterEnvironment {
    protected String name;

    public WaterEnvironment(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void add(VeggieFish fish) {
        System.out.println(String.format("Adding %s into the %s", fish, name));
    }

    public void addPredatorFish(PredatorFish fish) {
        System.out.println(String.format("Adding %s into the %s", fish, name));
    }

    public void addSnail(Snail snail) {
        System.out.println(String.format("Adding %s into %s", snail, name));
    }
}
