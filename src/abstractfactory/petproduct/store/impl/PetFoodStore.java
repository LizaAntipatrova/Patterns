package abstractfactory.petproduct.store.impl;

import abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import abstractfactory.petproduct.product.Tradeable;
import abstractfactory.petproduct.store.PetStore;

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
