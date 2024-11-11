package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Board {
    private final int numRows;
    private final int numCols;
    private final int mineCount;
    private MineTile[][] tiles;
    private ArrayList<MineTile> mines;
    private Random random;

    public Board(int numRows, int numCols, int mineCount) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.mineCount = mineCount;
        this.tiles = new MineTile[numRows][numCols];
        this.mines = new ArrayList<>();
        this.random = new Random();
        initializeTiles();
        setMines();
    }

    private void initializeTiles() {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                tiles[row][col] = new MineTile(row, col);
            }
        }
    }

    private void setMines() {
        int minesLeft = mineCount;
        while (minesLeft > 0) {
            int row = random.nextInt(numRows);
            int col = random.nextInt(numCols);
            MineTile tile = tiles[row][col];
            if (!mines.contains(tile)) {
                mines.add(tile);
                minesLeft--;
            }
        }
    }

    public MineTile[][] getTiles() {
        return tiles;
    }

    public ArrayList<MineTile> getMines() {
        return mines;
    }
}

