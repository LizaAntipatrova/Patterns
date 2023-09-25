package abstractfactory.factory.impl;

import abstractfactory.product.Tradable;
import abstractfactory.product.clothing.DogClothing;
import abstractfactory.product.food.DogFood;
import abstractfactory.factory.AbstractPetProductsFactory;

public class DogProductsFactory implements AbstractPetProductsFactory {
    @Override
    public Tradable buyFood() {
        return new DogFood();
    }

    @Override
    public Tradable buyClothing() {
        return new DogClothing();
    }
}
