package creational.abstractfactory.petproduct.store.impl;

import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import creational.abstractfactory.petproduct.product.Tradeable;
import creational.abstractfactory.petproduct.store.PetStore;

public class PetFoodStore extends PetStore {

    private Tradeable petFood;

    public PetFoodStore(AbstractPetProductsFactory factory) {
        super(factory);
    }

    @Override
    public Tradeable buyPetProduct() {
        this.petFood = factory.buyFood();
        return petFood;
    }
}
