package abstractfactory.product.clothing;

import abstractfactory.product.Tradable;

public class DogClothing implements Tradable {
    @Override
    public void chooseProduct() {
        System.out.println("Smiling dog is wearing shoes");

    }
}
