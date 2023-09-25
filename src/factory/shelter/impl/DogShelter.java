package factory.shelter.impl;

import factory.animal.Animal;
import factory.animal.impl.Dog;
import factory.shelter.AnimalShelter;

public class DogShelter extends AnimalShelter {
    @Override
    public Animal buyAnimal() {
        return new Dog();
    }
}
