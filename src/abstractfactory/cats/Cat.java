package abstractfactory.cats;

public class Cat {
    private String tail;
    private String color;
    private String face;
    private String ears;
    private String furLength;


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
