package factory;

import java.util.Scanner;

public class HouseCat {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();
        animalFactory.getAnimal(AnimalSpecies.DOG).makeSound();
    }
}
