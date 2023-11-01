package behavioral.template_method;

public class WhiteLaundry extends LaundryThings {


    @Override
    public void setMode() {
        System.out.println("Set white washing mode");
    }

    @Override
    public void pourLiquid() {
        super.pourLiquid();
        System.out.println("Pour bleach");
        System.out.println("Pour stain remover");
    }
}
