package creational.abstractfactory.petproduct.factory.impl;

import creational.abstractfactory.petproduct.product.Tradeable;
import creational.abstractfactory.petproduct.product.clothing.CatClothing;
import creational.abstractfactory.petproduct.product.food.CatFood;
import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;

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
