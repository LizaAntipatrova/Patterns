package behavioral.state;

public class IntactState extends State {
    public IntactState(Ship ship) {
        super(ship);
    }

    @Override
    public void hurt() {
        if (ship.getNumberDecks() == 1) {
            ship.setState(new KilledState(ship));
        } else {
            ship.setState(new DamagedState(ship));
        }

    }

    @Override
    public String toString() {
        return "Intact";
    }
}
