package singleton;

public class testSingleton {
    public static void main(String[] args) {
        Budget budget = Budget.getInstance();

        budget.addMoney(2000);
        budget.spendMoney(200);

        System.out.println(budget.getBalance());

        Budget budget1 = Budget.getInstance();

        System.out.println(budget1.getBalance());
    }
}
