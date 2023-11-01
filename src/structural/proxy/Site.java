package structural.proxy;

public class Site implements Loginable {

    @Override
    public void LoginAsUser() {
        System.out.println("You’re the user");
    }

    @Override
    public void LoginAsAdministrator() {
        System.out.println("You’re the administrator");
    }
}
