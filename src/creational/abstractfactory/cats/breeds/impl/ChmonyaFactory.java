package creational.abstractfactory.cats.breeds.impl;

import creational.abstractfactory.cats.breeds.AbstractCatBreedFactory;
import creational.abstractfactory.cats.elements.colors.FurColor;
import creational.abstractfactory.cats.elements.colors.impl.BlackAndWhiteFur;
import creational.abstractfactory.cats.elements.ears.Ear;
import creational.abstractfactory.cats.elements.ears.impl.StandardEars;
import creational.abstractfactory.cats.elements.faces.Face;
import creational.abstractfactory.cats.elements.faces.impl.FlattenedFace;
import creational.abstractfactory.cats.elements.fur.FurLength;
import creational.abstractfactory.cats.elements.fur.impl.LongFur;
import creational.abstractfactory.cats.elements.tails.Tail;
import creational.abstractfactory.cats.elements.tails.impl.ShortTail;

public class ChmonyaFactory extends AbstractCatBreedFactory {

    @Override
    public Tail addTail() {
        return new ShortTail();
    }

    @Override
    public Ear addEars() {
        return new StandardEars();
    }

    @Override
    public FurLength addFurLength() {
        return new LongFur();
    }

    @Override
    public FurColor addColor() {
        return new BlackAndWhiteFur();
    }

    @Override
    public Face addFace() {
        return new FlattenedFace();
    }
}
