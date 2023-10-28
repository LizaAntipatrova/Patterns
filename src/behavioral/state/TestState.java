package behavioral.state;

public class TestState {
    public static void main(String[] args) {
        Ship singleDeckShip = new Ship(1, 1, "horizontal", 1);
        Ship fourDeckShip = new Ship(4, 4, "vertical", 4);

        singleDeckShip.hurt();
        System.out.println(singleDeckShip);
        singleDeckShip.hurt();


        System.out.println(fourDeckShip);
        fourDeckShip.hurt();
        fourDeckShip.hurt();

        System.out.println(fourDeckShip);
        fourDeckShip.hurt();
        fourDeckShip.hurt();

    }
}
