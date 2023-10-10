package structural.proxy;

public class TestProxy {
    public static void main(String[] args) {
        Loginable site = new Site();
        Loginable proxy = new ProxySite(site, "woof");
        proxy.LoginAsUser();
    }
}
