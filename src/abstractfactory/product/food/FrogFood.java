package abstractfactory.product.food;

import abstractfactory.product.Tradable;

public class FrogFood implements Tradable {

    @Override
    public void chooseProduct() {
        System.out.println("Tasty frog food for your frog");
    }
}
