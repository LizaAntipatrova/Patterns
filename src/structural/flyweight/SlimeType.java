package structural.flyweight;

public enum SlimeType {
    FIRE("Red", "fire.jpg"),
    WATER("Blue", "water.png"),
    ELECTRIC("Purple", "electric.png"),
    EARTHED("Brown", "earthed.jpg");

    final String nameFile;
    final String color;


    SlimeType(String color, String element) {
        this.nameFile = element;
        this.color = color;
    }
}
