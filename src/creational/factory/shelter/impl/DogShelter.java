package creational.factory.shelter.impl;

import creational.factory.animal.Animal;
import creational.factory.animal.impl.Dog;
import creational.factory.shelter.AnimalShelter;

public class DogShelter extends AnimalShelter {
    @Override
    public Animal buyAnimal() {
        return new Dog();
    }
}
