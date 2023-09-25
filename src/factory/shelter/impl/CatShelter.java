package factory.shelter.impl;

import factory.animal.Animal;
import factory.animal.impl.Cat;
import factory.shelter.AnimalShelter;

public class CatShelter extends AnimalShelter {
    @Override
    public Animal buyAnimal() {
        return new Cat();
    }
}
