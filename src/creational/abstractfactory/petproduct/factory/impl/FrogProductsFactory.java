package creational.abstractfactory.petproduct.factory.impl;

import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import creational.abstractfactory.petproduct.product.Tradeable;
import creational.abstractfactory.petproduct.product.clothing.FrogClothing;
import creational.abstractfactory.petproduct.product.food.FrogFood;

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
