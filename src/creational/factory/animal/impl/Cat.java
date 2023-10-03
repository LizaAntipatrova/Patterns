package creational.factory.animal.impl;

import creational.factory.animal.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
