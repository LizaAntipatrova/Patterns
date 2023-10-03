package creational.abstractfactory.petproduct.store;

import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import creational.abstractfactory.petproduct.product.Tradeable;

public abstract class PetStore {
    protected AbstractPetProductsFactory factory;

    public PetStore(AbstractPetProductsFactory factory) {
        this.factory = factory;
    }

    abstract public Tradeable buyPetProduct();

}
