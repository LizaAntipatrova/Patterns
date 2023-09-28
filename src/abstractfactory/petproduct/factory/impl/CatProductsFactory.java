package abstractfactory.petproduct.factory.impl;

import abstractfactory.petproduct.product.Tradeable;
import abstractfactory.petproduct.product.clothing.CatClothing;
import abstractfactory.petproduct.product.food.CatFood;
import abstractfactory.petproduct.factory.AbstractPetProductsFactory;

public class CatProductsFactory implements AbstractPetProductsFactory {
    @Override
    public Tradeable buyFood() {
        return new CatFood();
    }

    @Override
    public Tradeable buyClothing() {
        return new CatClothing();
    }
}
