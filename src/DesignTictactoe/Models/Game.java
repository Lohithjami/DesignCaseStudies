package DesignTictactoe.Models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerMoveIndex;

    public static Builder getBuilder()
    {
        return new Builder();
    }

    public static class Builder{
        private int dimensions;
        private List<Player>players;

        public Builder setDimensions(int dimensions)
        {
            this.dimensions = dimensions;
            return this;
        }
        public Builder setPlayers(List<Player>players)
        {
            this.players = players;
            return this;
        }
        public Game build() {
            //validations can be added here
            //duplicate player symbol check can be added here

            Game game = new Game();
            game.board = new Board(dimensions);
            game.players = players;
            game.nextPlayerMoveIndex = 0;
            game.gameState = GameState.IN_PROGRESS;
            game.moves = new ArrayList<>();
            return game;
        }
    }
}
