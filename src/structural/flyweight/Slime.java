package structural.flyweight;

import javax.swing.*;
import java.awt.*;

public class Slime {
    private String element;
    private String color;

    public String getElement() {
        return element;
    }

    public String getColor() {
        return color;
    }

    public Slime(SlimeType slimeType) {
        this.color = slimeType.color;
        this.element = slimeType.element;
    }

    public JPanel draw(JPanel panel, int x, int y) {
        var cwd = System.getProperty("user.dir");

        var icon = new ImageIcon(cwd + "/src/structural/flyweight/images/" + element + ".png");

        //уменьшаем изображение
        Image newImage = icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);

        var image = new JLabel(element + " Slime", icon, SwingConstants.CENTER);

        Dimension size = image.getPreferredSize();
        image.setBounds(x, y, size.width, size.height);
        panel.add(image);

        return panel;
    }
}

