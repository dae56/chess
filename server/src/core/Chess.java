package core;

import core.ColorChessEnum;
import core.RoleChessEnum;

public class Chess {
    private ColorChessEnum color;
    private RoleChessEnum role;

    public Chess(ColorChessEnum color, RoleChessEnum role) {
        this.color = color;
        this.role = role;
    }

    public ColorChessEnum getColor() {
        return color;
    }

    public RoleChessEnum getRole() {
        return role;
    }

    public void setColor(ColorChessEnum color) {
        this.color = color;
    }

    public void setRole(RoleChessEnum role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "[" + color.toString() + ":" + role.toString() + "]";
    }
}
