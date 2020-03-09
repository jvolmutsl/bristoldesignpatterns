package com.scottlogic.dp.abstractfactory.fish.Fishies;

public abstract class Wobject {

    protected String name;

    public Wobject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
       return name;
    }
}
