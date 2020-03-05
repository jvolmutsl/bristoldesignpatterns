package com.scottlogic.dp.factorymethod.shipyards.game;

import java.util.Arrays;
import java.util.List;

public class Crew {

    private List<CrewMember> members;

    public Crew(CrewMember... newMembers) {
        this.members = Arrays.asList(newMembers);
    }

    public Crew(List<CrewMember> members) {
        this.members = members;
    }

    public List<CrewMember> members() {
        return members;
    }
}
