package com.scottlogic.dp.factorymethod.shipyards;


import com.scottlogic.dp.factorymethod.shipyards.game.GameMapInterface;
import com.scottlogic.dp.factorymethod.shipyards.player.PlayerInteractionSimulation;

/**
 * Run the project
 */
public class Main {
    public static void main(String... args) {
        PlayerInteractionSimulation interaction = new PlayerInteractionSimulation(new GameMapInterface());
        interaction.play();
    }
}
