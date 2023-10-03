package creational.abstractfactory.petproduct.factory.impl;

import creational.abstractfactory.petproduct.product.Tradeable;
import creational.abstractfactory.petproduct.product.clothing.DogClothing;
import creational.abstractfactory.petproduct.product.food.DogFood;
import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;

public class DogProductsFactory implements AbstractPetProductsFactory {
    @Override
    public Tradeable buyFood() {
        return new DogFood();
    }

    @Override
    public Tradeable buyClothing() {
        return new DogClothing();
    }
}
