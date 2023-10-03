package creational.abstractfactory.petproduct.store.impl;

import creational.abstractfactory.petproduct.product.Tradeable;
import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import creational.abstractfactory.petproduct.store.PetStore;

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
