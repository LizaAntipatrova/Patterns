package behavioral.cor;

public abstract class DecisiveComponent {

    protected DecisiveComponent nextInstance;
    protected double successRate;


    public abstract String solveProblem(String problem);

    public DecisiveComponent getNextInstance() {
        return nextInstance;
    }

    public void setNextInstance(DecisiveComponent nextInstance) {
        this.nextInstance = nextInstance;
    }
}
