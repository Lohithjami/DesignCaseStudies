package DesignTictactoe.Models;


import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimensions;
    private List<List<Cell>> cells;

    public Board(int dimensions)
    {
        this.dimensions = dimensions;
        this.cells = initalizeCells(dimensions);
    }

    public List<List<Cell>> initalizeCells(int dimensions) {
        List<List<Cell>> cells = new ArrayList<>();
        for(int i =0; i<dimensions; i++)
        {
            List<Cell> row = new ArrayList<>();
            for(int j = 0; j < dimensions; j++){
                row.add(new Cell(i, j));

            }
            cells.add(row);
        }
        return cells;
    }
}
