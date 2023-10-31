package behavioral.template_method;

public class TestTemplateMethod {
    public static void main(String[] args) {
        LaundryThings white = new WhiteLaundry();
        LaundryThings color = new ColorfulLaundry();
        LaundryThings black = new BlackLaundry();

        white.wash();
        color.wash();
        black.wash();
    }
}
