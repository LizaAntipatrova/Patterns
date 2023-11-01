package structural.bridge;

public class ButtonAppearance {

    private final ButtonFunctionality button = new ButtonFunctionality();
    private final String color = "Red";
    private final double radius = 5;

    public void click() {
        button.BlowUp();
    }

}
