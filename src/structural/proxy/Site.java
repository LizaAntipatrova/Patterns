package structural.proxy;

import javax.security.auth.login.LoginContext;

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
