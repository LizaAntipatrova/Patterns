package abstractfactory.product.food;

import abstractfactory.product.Tradable;

public class CatFood implements Tradable {

    @Override
    public void chooseProduct() {
        System.out.println("Tasty cat food for your cat");
    }
}
