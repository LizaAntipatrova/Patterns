package abstractfactory.petproduct.product.food;

import abstractfactory.petproduct.product.Tradeable;

public class DogFood implements Tradeable {
    @Override
    public void chooseProduct() {
        System.out.println("Tasty dog food for your dog");

    }
}
