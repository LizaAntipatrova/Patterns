package structural.flyweight;

import javax.swing.*;

public class SlimeLocation {
    private int x;
    private int y;
    private Slime typeSlime;

    public SlimeLocation(int x, int y, Slime typeSlime) {
        this.x = x;
        this.y = y;
        this.typeSlime = typeSlime;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Slime getTypeSlime() {
        return typeSlime;
    }

    public void setTypeSlime(Slime typeSlime) {
        this.typeSlime = typeSlime;
    }

    public JPanel draw(JPanel panel) {
        return typeSlime.draw(panel, x, y);
    }
}
