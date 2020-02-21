package com.scottlogic.dp.strategy.simplestrategy;

public class StrategyA implements Strategy {

    @Override
    public void performAction() {
        System.out.println("Doing A");
    }
}
