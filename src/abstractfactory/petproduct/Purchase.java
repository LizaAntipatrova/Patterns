package abstractfactory.petproduct;

import abstractfactory.petproduct.factory.AbstractPetProductsFactory;
import abstractfactory.petproduct.factory.impl.CatProductsFactory;
import abstractfactory.petproduct.factory.impl.DogProductsFactory;
import abstractfactory.petproduct.factory.impl.FrogProductsFactory;
import abstractfactory.petproduct.product.Tradeable;
import abstractfactory.petproduct.store.impl.PetClothingStore;
import abstractfactory.petproduct.store.impl.PetFoodStore;

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