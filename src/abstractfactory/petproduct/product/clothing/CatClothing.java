package abstractfactory.petproduct.product.clothing;

import abstractfactory.petproduct.product.Tradeable;

public class CatClothing implements Tradeable {
    @Override
    public void chooseProduct() {
        System.out.println("Smiling cat is wearing a jacket");
    }
}
