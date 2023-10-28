package behavioral.state;

public abstract class State {
    protected Ship ship;

    public State(Ship ship) {
        this.ship = ship;
    }

    public abstract void hurt();
}
