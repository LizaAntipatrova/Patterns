package structural.flyweight;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSlimeArea {
    public static void main(String[] args) {
        List<Request> requests = new ArrayList<>();
        int type;
        int x;
        int y;

        System.out.println("You are welcomed by the slime creation simulator,\n" +
                "and it is time to create the slime with the help of queries.\n" +
                "Queries are constructed as follows, enter one of 4 digits - a kind of slam.\n" +
                "1 - earthed \n" +
                "2 - electric \n " +
                "3 - fire \n" +
                "4 - water\n" +
                "Press \"enter\" and enter another 2 numbers of coordinates, the location of the slime.\n" +
                "If you finish, enter \"-1\"");


        try(Scanner scanner = new Scanner(System.in)) {
            type = scanner.nextInt();
            while (type>0){
                x = scanner.nextInt();
                y = scanner.nextInt();

                if (type == 1){
                   requests.add(new Request(SlimeType.EARTHED, x, y));
                } else if (type == 2) {
                    requests.add(new Request(SlimeType.ELECTRIC, x, y));

                } else if (type == 3) {
                    requests.add(new Request(SlimeType.FIRE, x, y));

                } else if (type == 4) {
                    requests.add(new Request(SlimeType.WATER, x, y));

                }else{
                    System.out.println("unknown type");
                }
                type = scanner.nextInt();

            }

        }

        SlimesArea.createSlimeArea(requests);
    }
}
/* тестовые данные
1 1 1
2 100 100
3 200 200
4 300 300
2
100 11
4 500 10
3 20 400
4 30 30
2
100 500
2
700 10
4 500 200
2 400 300
1 30 30
3
600 50
-1
 */