package creational.factory.shelter.impl;

import creational.factory.animal.Animal;
import creational.factory.animal.impl.Cat;
import creational.factory.shelter.AnimalShelter;

public class CatShelter extends AnimalShelter {
    @Override
    public Animal buyAnimal() {
        return new Cat();
    }
}
