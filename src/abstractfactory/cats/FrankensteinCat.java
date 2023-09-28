package abstractfactory.cats;

import abstractfactory.cats.breeds.AbstractCatBreedFactory;
import abstractfactory.cats.breeds.impl.ChmonyaFactory;
import abstractfactory.cats.breeds.impl.ShlepaFactory;

public class FrankensteinCat {
    public static void main(String[] args) {
        AbstractCatBreedFactory factory = new ChmonyaFactory();
        System.out.println(factory.catAssembly());
    }

}
