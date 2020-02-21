package com.scottlogic.dp.strategy.entertainerexercise;

import java.io.BufferedOutputStream;
import java.io.PrintStream;

public class Entertainer {

    private EntertainerType type;

    public Entertainer(EntertainerType type) {
        this.type = type;
    }

    public void takeABow() {
        System.out.println("Bows");
    }

    public void perform(PrintStream out) {
        if(type == EntertainerType.JUGGLER) {
            out.println("Throw some balls");
            out.println("Keep catching and throwing them");
            out.println("Catch all balls");
        } else if(type == EntertainerType.MAGICIAN) {
            out.println("Show cards");
            out.println("Let them pick");
            out.println("Collect");
            out.println("Make a joke");
            out.println("Shuffle cards");
            out.println("Find the card");
        } else if(type == EntertainerType.SINGER) {
            out.println("Take a bow");
            out.println("Singing the song.");
            out.println("Drop the mic");
        }
    }
}
