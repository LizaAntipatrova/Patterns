package behavioral.state;

public class DamagedState extends State {
    private int intactDeck = ship.getNumberDecks() - 1;

    public DamagedState(Ship ship) {
        super(ship);
    }

    @Override
    public void hurt() {
        intactDeck -= 1;
        if (intactDeck == 0) {
            ship.setState(new KilledState(ship));
        }
    }

    @Override
    public String toString() {
        return "Damaged";
    }
}
