package abstractfactory.product.food;

import abstractfactory.product.Tradable;

public class DogFood implements Tradable {
    @Override
    public void chooseProduct() {
        System.out.println("Tasty dog food for your dog");

    }
}
