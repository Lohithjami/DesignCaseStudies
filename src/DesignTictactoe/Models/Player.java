package DesignTictactoe.Models;

public class Player {
    private String name;
    private Symbol symbol;
    private Playertype playertype;

    public Player(String name,Symbol symbol ,Playertype playertype)
    {
        this.name = name;
        this.symbol = symbol;
        this.playertype = playertype;
    }
}
