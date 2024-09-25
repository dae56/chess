package core.chess;

public class Rook extends Chess{

    public Rook(ColorChessEnum color) {
        super(color);
    }

    public static void main(String[] args) {
        Rook rook = new Rook(ColorChessEnum.WHITE);
        System.out.println(rook.getColor());
    }
}
