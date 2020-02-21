package com.scottlogic.dp.strategy.simplestrategy;

public class Main {
    public static void main(String... args) {
        StrategyA A = new StrategyA();
        StrategyB B = new StrategyB();
        Context C1 = new Context(A);
        Context C2 = new Context(A);

        // Will produce result of Strategy B
        C1.action(B);

        // Will produce result of Strategy A
        C1.action();


        // Will produce result of Strategy A
        C2.action();

        // Will produce result of Strategy B
        C2.setStrategy(B);
        C2.action();

        // Will produce result of Strategy A
        C2.action(A);
    }
}
