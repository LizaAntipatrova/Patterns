package abstractfactory.petproduct.factory;

import abstractfactory.petproduct.product.Tradeable;

public interface AbstractPetProductsFactory {
    public Tradeable buyFood();
    public Tradeable buyClothing();

}
