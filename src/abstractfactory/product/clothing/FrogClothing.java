package abstractfactory.product.clothing;

import abstractfactory.product.Tradable;

public class FrogClothing implements Tradable {
    @Override
    public void chooseProduct() {
        System.out.println("Smiling frog is wearing a hat");
    }
}
