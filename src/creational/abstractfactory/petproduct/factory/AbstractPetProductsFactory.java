package creational.abstractfactory.petproduct.factory;

import creational.abstractfactory.petproduct.product.Tradeable;

public interface AbstractPetProductsFactory {
    public Tradeable buyFood();
    public Tradeable buyClothing();

}
