package abstractfactory.factory.impl;

import abstractfactory.product.Tradable;
import abstractfactory.product.clothing.FrogClothing;
import abstractfactory.product.food.FrogFood;
import abstractfactory.factory.AbstractPetProductsFactory;

public class FrogProductsFactory implements AbstractPetProductsFactory {
    @Override
    public Tradable buyFood() {
        return new FrogFood();
    }

    @Override
    public Tradable buyClothing() {
        return new FrogClothing();
    }
}
