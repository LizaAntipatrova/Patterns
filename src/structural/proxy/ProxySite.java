package structural.proxy;

public class ProxySite implements Loginable {

    private final Loginable site;
    private final String password;

    public ProxySite(Loginable site, String password) {
        this.site = site;
        this.password = password;
    }

    @Override
    public void LoginAsUser() {
        if (checkUserPassword()) {
            site.LoginAsUser();
        } else System.out.println("Wrong!");
    }

    @Override
    public void LoginAsAdministrator() {
        if (checkAdminPassword()) {
            site.LoginAsAdministrator();
        } else System.out.println("Wrong!");
    }

    private boolean checkAdminPassword() {
        return password.equals("meow");
    }

    private boolean checkUserPassword() {
        return password.equals("woof");
    }
}
