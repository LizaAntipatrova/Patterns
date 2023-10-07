package structural.flyweight;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSlimeArea {
    public static void main(String[] args) {
        List<Request> requests = new ArrayList<>();
        String type;
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
                "If you finish, enter \"end\"");


        try(Scanner scanner = new Scanner(System.in)) {
            type = scanner.nextLine();
            if (!type.equals("end")){
                x = scanner.nextInt();
                y = scanner.nextInt();

                if (type.equals("1")){
                   requests.add(new Request(SlimeType.EARTHED, x, y));
                } else if (type.equals("2")) {
                    requests.add(new Request(SlimeType.EARTHED, x, y));

                } else if (type.equals("3")) {
                    requests.add(new Request(SlimeType.EARTHED, x, y));

                } else if (type.equals("4")) {
                    requests.add(new Request(SlimeType.EARTHED, x, y));

                }else{
                    System.out.println("unknown type");
                }

            }

        }

        SlimesArea.createSlimeArea(requests);
    }
}
