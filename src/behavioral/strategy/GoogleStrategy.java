package behavioral.strategy;

public class GoogleStrategy implements AuthorisationStrategy {
    @Override
    public void login() {
        System.out.println("Google authorization algorithm");
    }
}
