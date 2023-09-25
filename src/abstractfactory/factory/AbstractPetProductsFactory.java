package abstractfactory.factory;

import abstractfactory.product.Tradable;

public interface AbstractPetProductsFactory {
    public Tradable buyFood();
    public Tradable buyClothing();

}
