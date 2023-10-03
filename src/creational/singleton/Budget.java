package creational.singleton;

public class Budget {
    private static Budget instance;
    private double balance;

    private Budget() {
    }

    public static Budget getInstance() {
        if (instance == null) {
            instance = new Budget();
        }
        return instance;
    }

    public void addMoney(double money) {
        balance += money;
    }

    public void spendMoney(double money) {
        balance -= money;
    }

    public double getBalance() {
        return balance;
    }
}
