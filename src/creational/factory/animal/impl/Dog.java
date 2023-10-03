package creational.factory.animal.impl;

import creational.factory.animal.Animal;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
