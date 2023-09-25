package abstractfactory.store.impl;

import abstractfactory.product.Tradable;
import abstractfactory.factory.AbstractPetProductsFactory;
import abstractfactory.store.PetStore;

public class PetClothingStore extends PetStore {

    private Tradable petClothing;
    public PetClothingStore(AbstractPetProductsFactory factory) {
        super(factory);
    }

    @Override
    public Tradable buyPetProduct() {
        this.petClothing = factory.buyClothing();
        return petClothing;
    }
}
