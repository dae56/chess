package core;

import core.chess.Chess;

public class Table {

    private class Cell {
        Chess chess = null;

        public void setChess(Chess chess) {
            this.chess = chess;
        }

        public Chess getChess() {
            return chess;
        }

        public Cell(Chess chess) {
            this.chess = chess;
        }
    }

    Cell[][] table = new Cell[8][8];

    public static 

    public Table() {
        
    }
}
