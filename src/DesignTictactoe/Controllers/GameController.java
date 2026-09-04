package DesignTictactoe.Controllers;

import DesignTictactoe.Models.Game;
import DesignTictactoe.Models.Player;

import java.util.List;

public class GameController {

    public Game startGame(int dimensions , List<Player> players)
    {
        Game game = Game.getBuilder()
                .setDimensions(dimensions)
                .setPlayers(players)
                .build();
        return game;
    }
}
