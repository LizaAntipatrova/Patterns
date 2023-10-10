package structural.flyweight;

import javax.swing.*;
import java.util.List;


public class SlimesArea extends JFrame {
    public SlimesArea(String title) {
        super(title);
    }

    public static void createSlimeArea(List<Request> requests) {

        var frame = new SlimesArea("SlimesArea");

        var panel = new JPanel();

        frame.getContentPane();

        panel.setLayout(null);

        for (Request request : requests) {
            SlimeFactory.getSlime(request.getType())
                    .draw(panel, request.getX(), request.getY());
        }


        // добавляем панель в главный фрейм (окно)
        frame.add(panel);

        // устанавливаем размер окна
        frame.setSize(1000, 800);

        // при закрытии окна - выходим из приложения (важно всегда правильно закрывать окна)
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // помещаем окно в центре экрана
        frame.setLocationRelativeTo(null);

        // делаем окно видимым
        frame.setVisible(true);
    }
}
