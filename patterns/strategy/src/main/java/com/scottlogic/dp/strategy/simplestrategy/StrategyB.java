package com.scottlogic.dp.strategy.simplestrategy;

public class StrategyB implements Strategy {

    @Override
    public void performAction() {
        System.out.println("Doing B");
    }
}
