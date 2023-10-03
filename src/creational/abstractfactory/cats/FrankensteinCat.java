package creational.abstractfactory.cats;

import creational.abstractfactory.cats.breeds.AbstractCatBreedFactory;
import creational.abstractfactory.cats.breeds.impl.ChmonyaFactory;

public class FrankensteinCat {
    public static void main(String[] args) {
        AbstractCatBreedFactory factory = new ChmonyaFactory();
        System.out.println(factory.catAssembly());
    }

}
