package behavioral.template_method;

public abstract class LaundryThings {

    public void wash() {
        loadWashMachine();
        pourWashGel();
        pourLiquid();
        setMode();
        startWashMachine();
    }

    public void loadWashMachine() {
        System.out.println("Load the laundry into the washing machine");
    }

    public void pourWashGel() {
        System.out.println("Pour wash gel");
    }

    public abstract void setMode();

    public void pourLiquid() {
        System.out.println("Pour fabric softener");
    }

    public void startWashMachine() {
        System.out.println("Click \"Start\"");
    }


}
