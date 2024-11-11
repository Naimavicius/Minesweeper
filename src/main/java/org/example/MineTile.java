package org.example;

import javax.swing.JButton;

public class MineTile extends JButton {
    private int row;
    private int col;

    public MineTile(int row, int col) {
        this.row = row;
        this.col = col;
        setFocusable(false);
        setMargin(new java.awt.Insets(0, 0, 0, 0));
        setText("");
        setFont(new java.awt.Font("Arial Unicode MS", java.awt.Font.PLAIN, 35));
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
