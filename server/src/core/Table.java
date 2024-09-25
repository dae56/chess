package core;

import java.lang.reflect.Array;
import java.util.Arrays;

import core.chess.Bishop;
import core.chess.Chess;
import core.chess.ColorChessEnum;
import core.chess.King;
import core.chess.Knight;
import core.chess.Pawn;
import core.chess.Queen;
import core.chess.Rook;

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

    public Cell[][] getTable() {
        return table;
    }

    public static int convertCoordLetter(String letter) {
        return letter.charAt(0) - 65;
    }

    public static int convertCoordNumber(String num) {
        return num.charAt(1) - 49;
    }

    public static void printTable(Table table) {
        Cell[][] tableToPrint = table.getTable();
        for (int i = 0; i < 8; i ++) {
            for (int j = 0; j < 8; j ++) {
                if (tableToPrint[i][j] != null) {
                    System.out.print(tableToPrint[i][j].getChess().toString());
                } else {
                    System.out.print("[null:nulll]");
                }
                
            }
            System.out.println("");
        }
    }

    public Table(Cell[][] tableCells) {
        table = tableCells;
    }

    public Table() {
        table[0][0] = new Cell(new Rook(ColorChessEnum.WHITE));
        table[0][1] = new Cell(new Knight(ColorChessEnum.WHITE));
        table[0][2] = new Cell(new Bishop(ColorChessEnum.WHITE));
        table[0][3] = new Cell(new Queen(ColorChessEnum.WHITE));
        table[0][4] = new Cell(new King(ColorChessEnum.WHITE));
        table[0][5] = new Cell(new Bishop(ColorChessEnum.WHITE));
        table[0][6] = new Cell(new Knight(ColorChessEnum.WHITE));
        table[0][7] = new Cell(new Rook(ColorChessEnum.WHITE));
        for (int i = 0; i < 8; i ++) {
            table[1][i] = new Cell(new Pawn(ColorChessEnum.WHITE));
        }
        table[7][0] = new Cell(new Rook(ColorChessEnum.BLACK));
        table[7][1] = new Cell(new Knight(ColorChessEnum.BLACK));
        table[7][2] = new Cell(new Bishop(ColorChessEnum.BLACK));
        table[7][3] = new Cell(new Queen(ColorChessEnum.BLACK));
        table[7][4] = new Cell(new King(ColorChessEnum.BLACK));
        table[7][5] = new Cell(new Bishop(ColorChessEnum.BLACK));
        table[7][6] = new Cell(new Knight(ColorChessEnum.BLACK));
        table[7][7] = new Cell(new Rook(ColorChessEnum.BLACK));
        for (int i = 0; i < 8; i ++) {
            table[6][i] = new Cell(new Pawn(ColorChessEnum.BLACK));
        }
    }

    public static void main(String[] args) {
        System.out.println(convertCoordLetter("B2"));
        System.out.println(convertCoordNumber("B2"));
        Table table = new Table();
        Table.printTable(table);
    }
}
