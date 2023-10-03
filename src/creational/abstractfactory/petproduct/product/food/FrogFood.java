package creational.abstractfactory.petproduct.product.food;

import creational.abstractfactory.petproduct.product.Tradeable;

public class FrogFood implements Tradeable {

    @Override
    public void chooseProduct() {
        System.out.println("Tasty frog food for your frog");
    }
}
