package structural.bridge;

public class ButtonAppearance {

    private ButtonFunctionality button = new ButtonFunctionality();
    private String color = "Red";
    private double radius = 5;

    public void click() {
        button.BlowUp();
    }

}
