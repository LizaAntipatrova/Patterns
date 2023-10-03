package creational.factory;

import creational.factory.animal.Animal;
import creational.factory.shelter.impl.CatShelter;
import creational.factory.shelter.impl.DogShelter;

public class AnimalFactory {

    public Animal getAnimal(AnimalSpecies species){

        Animal animal = null;
        if (species == AnimalSpecies.CAT){
            animal = new CatShelter().buyAnimal();
        } else if (species == AnimalSpecies.DOG) {
            animal = new DogShelter().buyAnimal();
        }
        return animal;
    }


}
