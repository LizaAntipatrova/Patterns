package abstractfactory.petproduct.store.impl;

import abstractfactory.petproduct.product.Tradeable;
import abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import abstractfactory.petproduct.store.PetStore;

public class PetClothingStore extends PetStore {

    private Tradeable petClothing;
    public PetClothingStore(AbstractPetProductsFactory factory) {
        super(factory);
    }

    @Override
    public Tradeable buyPetProduct() {
        this.petClothing = factory.buyClothing();
        return petClothing;
    }
}
