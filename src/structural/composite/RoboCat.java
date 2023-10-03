package structural.composite;

public class RoboCat implements Component {
    private double weight;

    public RoboCat(double weight) {
        this.weight = weight;
    }

    @Override
    public double weigh() {
        return weight;
    }
}
