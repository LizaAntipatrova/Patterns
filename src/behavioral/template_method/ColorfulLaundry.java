package behavioral.template_method;

public class ColorfulLaundry extends LaundryThings {
    @Override
    public void setMode() {
        System.out.println("Set colorful washing mode");
    }

    @Override
    public void pourLiquid() {
        super.pourLiquid();
        System.out.println("Pour stain remover");
    }
}
