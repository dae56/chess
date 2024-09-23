package core;

import java.util.HashMap;

public class Table {

    private class Cell {
        private Chess chess = null;

        private boolean isEmpty() {
            if (chess != null) {
                return true;
            }
            return false;
        }

        private Chess getChess() {
            return chess;
        }

        private void setChess(Chess chess) {
            this.chess = chess;
        }
        private void removeChess() {
            chess = null;
        }

        @Override
        public String toString() {
            if (chess != null) {
                return chess.toString();
            }
            return "null";
        }
    }

    private HashMap<String, Cell> table = new HashMap<>();

    public HashMap<String, Cell> getTable() {
        return table;
    }

    public Table() {
        for (int i = 1; i < 9; i ++) {
            String coord = new String();
            coord += Character.toString((char) 64 + i);
            for (int num = 1; num < 9; num ++) {
                String number = new String();
                number += coord + Integer.toString(num);
                table.put(number, new Cell()); // trable: uncorrect concanate coordinate;
            }
        }
    }

    public static void main(String[] args) {
        Table table = new Table();
        HashMap<String, Cell> tablegrid = table.getTable();
        for (String cord: tablegrid.keySet()) {
            Cell val = tablegrid.get(cord);

            System.out.println(cord.toString() + val);
        }
    }
}
