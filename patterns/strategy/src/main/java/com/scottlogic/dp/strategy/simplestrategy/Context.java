package com.scottlogic.dp.strategy.simplestrategy;

public class Context {

    private Strategy str;

    public Context(Strategy str) {
        this.str = str;
    }

    public void action(Strategy action) {
        action.performAction();
    }

    public void action() {
        this.str.performAction();
    }

    public void setStrategy(Strategy str) {
        this.str = str;
    }
}
