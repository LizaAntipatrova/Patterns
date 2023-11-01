package structural.flyweight;

import javax.swing.*;
import java.awt.*;

public class Slime {
    private final String nameFile;
    private final String color;

    public Slime(SlimeType slimeType) {
        this.color = slimeType.color;
        this.nameFile = slimeType.nameFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public String getColor() {
        return color;
    }

    public JPanel draw(JPanel panel, int x, int y) {
        var cwd = System.getProperty("user.dir");

        var icon = new ImageIcon(cwd + "/src/structural/flyweight/images/" + nameFile);

        //уменьшаем изображение
        Image newImage = icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);

        var image = new JLabel(icon);

        Dimension size = image.getPreferredSize();
        image.setBounds(x, y, size.width, size.height);
        panel.add(image);

        return panel;
    }
}

