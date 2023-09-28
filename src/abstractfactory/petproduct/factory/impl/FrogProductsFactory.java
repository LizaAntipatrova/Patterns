package abstractfactory.petproduct.factory.impl;

import abstractfactory.petproduct.product.Tradeable;
import abstractfactory.petproduct.product.clothing.FrogClothing;
import abstractfactory.petproduct.product.food.FrogFood;
import abstractfactory.petproduct.factory.AbstractPetProductsFactory;

public class FrogProductsFactory implements AbstractPetProductsFactory {
    @Override
    public Tradeable buyFood() {
        return new FrogFood();
    }

    @Override
    public Tradeable buyClothing() {
        return new FrogClothing();
    }
}
