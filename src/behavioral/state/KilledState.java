package behavioral.state;

public class KilledState extends State {
    public KilledState(Ship ship) {
        super(ship);
    }

    @Override
    public void hurt() {
        System.out.println("Leave the dead ship alone!");
    }


    @Override
    public String toString() {
        return "Killed";
    }
}
