package structural.flyweight;

public enum SlimeType {
    FIRE("Red", "fire"),
    WATER("Blue", "water"),
    ELECTRIC("Purple", "electric"),
    EARTHED("Brown", "earthed");

    final String element;
    final String color;


    SlimeType(String element, String color) {
        this.element = element;
        this.color = color;
    }
}
