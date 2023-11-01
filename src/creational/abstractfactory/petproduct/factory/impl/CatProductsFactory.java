package creational.abstractfactory.petproduct.factory.impl;

import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import creational.abstractfactory.petproduct.product.Tradeable;
import creational.abstractfactory.petproduct.product.clothing.CatClothing;
import creational.abstractfactory.petproduct.product.food.CatFood;

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
