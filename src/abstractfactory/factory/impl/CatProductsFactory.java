package abstractfactory.factory.impl;

import abstractfactory.product.Tradable;
import abstractfactory.product.clothing.CatClothing;
import abstractfactory.product.food.CatFood;
import abstractfactory.factory.AbstractPetProductsFactory;

public class CatProductsFactory implements AbstractPetProductsFactory {
    @Override
    public Tradable buyFood() {
        return new CatFood();
    }

    @Override
    public Tradable buyClothing() {
        return new CatClothing();
    }
}
