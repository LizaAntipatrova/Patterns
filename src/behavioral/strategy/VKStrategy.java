package behavioral.strategy;

public class VKStrategy implements AuthorisationStrategy {
    @Override
    public void login() {
        System.out.println("VK authorization algorithm");
    }
}
