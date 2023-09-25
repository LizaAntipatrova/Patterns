package factory.animal.impl;

import factory.animal.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
