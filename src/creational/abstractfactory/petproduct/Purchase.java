package creational.abstractfactory.petproduct;

import creational.abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import creational.abstractfactory.petproduct.factory.impl.CatProductsFactory;
import creational.abstractfactory.petproduct.factory.impl.DogProductsFactory;
import creational.abstractfactory.petproduct.factory.impl.FrogProductsFactory;
import creational.abstractfactory.petproduct.product.Tradeable;
import creational.abstractfactory.petproduct.store.impl.PetClothingStore;
import creational.abstractfactory.petproduct.store.impl.PetFoodStore;

public class Purchase {

    public Tradeable makePurchase(PetSpecies pet, ProductTypes product){
        AbstractPetProductsFactory factory = null;

        if(pet == PetSpecies.CAT){
            factory = new CatProductsFactory();
        }else if(pet == PetSpecies.DOG){
            factory = new DogProductsFactory();
        } else if (pet == PetSpecies.FROG) {
            factory = new FrogProductsFactory();
        }

        if(product == ProductTypes.FOOD){
            return new PetFoodStore(factory).buyPetProduct();
        }else {
            return new PetClothingStore(factory).buyPetProduct();
        }

    }
}