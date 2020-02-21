package com.scottlogic.dp.strategy.entertainerexercise;

public class Main {
    public static void main(String... args) {
        Entertainer juggler = new Entertainer(EntertainerType.JUGGLER);
        juggler.takeABow();
        juggler.perform(System.out);

        System.out.println(System.lineSeparator());

        Entertainer magician = new Entertainer(EntertainerType.MAGICIAN);
        magician.takeABow();
        magician.perform(System.out);

        System.out.println(System.lineSeparator());

        Entertainer singer = new Entertainer(EntertainerType.SINGER);
        singer.takeABow();
        singer.perform(System.out);
    }
}
