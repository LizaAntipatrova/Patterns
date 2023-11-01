package structural.facade;

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        for (String food : sandwich.createSandwich()) {
            System.out.println(food);
        }
    }
}
