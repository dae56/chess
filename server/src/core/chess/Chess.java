package core.chess;

public class Chess {
    private ColorChessEnum color;

    public Chess(ColorChessEnum color) {
        this.color = color;
    }

    public ColorChessEnum getColor() {
        return color;
    }

    public void setColor(ColorChessEnum newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ":" + color.toString() + "]";
    }
}
