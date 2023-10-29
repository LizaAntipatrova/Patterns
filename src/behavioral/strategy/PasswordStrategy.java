package behavioral.strategy;

public class PasswordStrategy implements AuthorisationStrategy {
    @Override
    public void login() {
        System.out.println("Password authorization algorithm");
    }
}
