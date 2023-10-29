package behavioral.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Authorisation authorisationOnSite = new Authorisation();
        authorisationOnSite.login();
        authorisationOnSite.setStrategy(new GoogleStrategy());
        authorisationOnSite.login();
        authorisationOnSite.setStrategy(new VKStrategy());
        authorisationOnSite.login();
    }
}
