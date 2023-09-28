package abstractfactory.petproduct.store;

import abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import abstractfactory.petproduct.product.Tradeable;

public abstract class PetStore {
    protected AbstractPetProductsFactory factory;

    public PetStore(AbstractPetProductsFactory factory) {
        this.factory = factory;
    }

    abstract public Tradeable buyPetProduct();

}
