package creational.abstractfactory.cats;

public class Cat {
    private final String tail;
    private final String color;
    private final String face;
    private final String ears;
    private final String furLength;


    public Cat(String tail, String color, String face, String ears, String furLength) {
        this.tail = tail;
        this.color = color;
        this.face = face;
        this.ears = ears;
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "tail='" + tail + '\'' +
                ", color='" + color + '\'' +
                ", face='" + face + '\'' +
                ", ears='" + ears + '\'' +
                ", furLength='" + furLength + '\'' +
                '}';
    }
}
