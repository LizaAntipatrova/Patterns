package structural.flyweight;

import javax.swing.*;

public class SlimeLocation {
    int x;
    int y;
    Slime typeSlime;

    public JPanel draw(JPanel panel) {
        return typeSlime.draw(panel, x, y);
    }
}
