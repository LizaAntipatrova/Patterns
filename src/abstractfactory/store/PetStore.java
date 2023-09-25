package abstractfactory.store;

import abstractfactory.factory.AbstractPetProductsFactory;
import abstractfactory.product.Tradable;

public abstract class PetStore {
    protected AbstractPetProductsFactory factory;

    public PetStore(AbstractPetProductsFactory factory) {
        this.factory = factory;
    }

    abstract public Tradable buyPetProduct();

}
