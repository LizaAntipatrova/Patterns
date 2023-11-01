package creational.prototype;

public class GenusLepus {
    private final double weight;
    private final String color;

    public GenusLepus(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public GenusLepus(GenusLepus genusLepus) {
        this.weight = genusLepus.weight;
        this.color = genusLepus.color;
    }

    @Override
    public String toString() {
        return weight + " kg, " + color + " color, ";
    }


}
