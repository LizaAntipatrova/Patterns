package abstractfactory.store.impl;

import abstractfactory.factory.AbstractPetProductsFactory;
import abstractfactory.product.Tradable;
import abstractfactory.store.PetStore;

public class PetFoodStore extends PetStore {

    private Tradable petFood;

    public PetFoodStore(AbstractPetProductsFactory factory) {
        super(factory);
    }

    @Override
    public Tradable buyPetProduct() {
        this.petFood = factory.buyFood();
        return petFood;
    }
}
