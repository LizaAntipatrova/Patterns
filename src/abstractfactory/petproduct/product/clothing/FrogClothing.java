package abstractfactory.petproduct.product.clothing;

import abstractfactory.petproduct.product.Tradeable;

public class FrogClothing implements Tradeable {
    @Override
    public void chooseProduct() {
        System.out.println("Smiling frog is wearing a hat");
    }
}
