package abstractfactory.petproduct.factory.impl;

import abstractfactory.petproduct.product.Tradeable;
import abstractfactory.petproduct.product.clothing.DogClothing;
import abstractfactory.petproduct.product.food.DogFood;
import abstractfactory.petproduct.factory.AbstractPetProductsFactory;

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
