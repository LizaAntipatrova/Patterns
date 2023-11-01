package creational.abstractfactory.petproduct.factory;

import creational.abstractfactory.petproduct.product.Tradeable;

public interface AbstractPetProductsFactory {
    Tradeable buyFood();

    Tradeable buyClothing();

}
