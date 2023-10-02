package prototype;

public class Rabbit extends GenusLepus implements Cloneable{
    private String breed;

    public Rabbit(double weight, String color, String breed) {
        super(weight, color);
        this.breed = breed;
    }

    public Rabbit(Rabbit rabbit){
        super(rabbit);
        this.breed = rabbit.breed;
    }

    @Override
    public Cloneable clone() {
        return new Rabbit(this);
    }

    @Override
    public String toString() {
        return super.toString() + breed + " breed";
    }
}
