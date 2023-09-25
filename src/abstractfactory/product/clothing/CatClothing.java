package abstractfactory.product.clothing;

import abstractfactory.product.Tradable;

public class CatClothing implements Tradable {
    @Override
    public void chooseProduct() {
        System.out.println("Smiling cat is wearing a jacket");
    }
}
