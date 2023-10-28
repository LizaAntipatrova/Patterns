package behavioral.state;

public class Ship {

    private State state;
    private final int x;
    private final int y;
    private final String orientation;
    private final int numberDecks;

    public Ship(int x, int y, String orientation, int numberDecks) {
        this.state = new IntactState(this);
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.numberDecks = numberDecks;
    }

    public void hurt() {
        state.hurt();
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNumberDecks() {
        return numberDecks;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "state=" + state.toString() +
                ", x=" + x +
                ", y=" + y +
                ", orientation='" + orientation + '\'' +
                ", numberDecks=" + numberDecks +
                '}';
    }
}
