package creational.abstractfactory.petproduct.product.clothing;

import creational.abstractfactory.petproduct.product.Tradeable;

public class DogClothing implements Tradeable {
    @Override
    public void chooseProduct() {
        System.out.println("Smiling dog is wearing shoes");

    }
}
