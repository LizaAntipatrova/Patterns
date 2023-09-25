package abstractfactory;

import abstractfactory.factory.AbstractPetProductsFactory;
import abstractfactory.factory.impl.CatProductsFactory;
import abstractfactory.factory.impl.DogProductsFactory;
import abstractfactory.factory.impl.FrogProductsFactory;
import abstractfactory.product.Tradable;
import abstractfactory.store.impl.PetClothingStore;
import abstractfactory.store.impl.PetFoodStore;

public class Purchase {

    public Tradable makePurchase(PetSpecies pet, ProductTypes product){
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