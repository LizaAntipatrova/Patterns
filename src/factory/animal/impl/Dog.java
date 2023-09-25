package factory.animal.impl;

import factory.animal.Animal;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
