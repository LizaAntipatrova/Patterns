package behavioral.strategy;

public class Authorisation {
    AuthorisationStrategy strategy;

    public Authorisation() {
        this.strategy = new PasswordStrategy();
    }

    public void login() {
        strategy.login();
    }

    public void setStrategy(AuthorisationStrategy strategy) {
        this.strategy = strategy;
    }
}
