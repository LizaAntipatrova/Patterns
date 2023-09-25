package factory;

import factory.animal.Animal;
import factory.shelter.AnimalShelter;
import factory.shelter.impl.CatShelter;
import factory.shelter.impl.DogShelter;

import java.util.Scanner;

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
