package creational.abstractfactory.petproduct.product.food;

import creational.abstractfactory.petproduct.product.Tradeable;

public class CatFood implements Tradeable {

    @Override
    public void chooseProduct() {
        System.out.println("Tasty cat food for your cat");
    }
}
