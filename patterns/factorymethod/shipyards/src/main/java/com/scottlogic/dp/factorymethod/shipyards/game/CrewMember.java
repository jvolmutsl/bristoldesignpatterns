package com.scottlogic.dp.factorymethod.shipyards.game;

public class CrewMember {
    private String name;
    private int age;

    public CrewMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int age() {
        return age;
    }
}
