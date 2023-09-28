package abstractfactory.cats.breeds.impl;

import abstractfactory.cats.breeds.AbstractCatBreedFactory;
import abstractfactory.cats.elements.colors.FurColor;
import abstractfactory.cats.elements.colors.impl.BlackAndWhiteFur;
import abstractfactory.cats.elements.ears.Ear;
import abstractfactory.cats.elements.ears.impl.StandardEars;
import abstractfactory.cats.elements.faces.Face;
import abstractfactory.cats.elements.faces.impl.FlattenedFace;
import abstractfactory.cats.elements.fur.FurLength;
import abstractfactory.cats.elements.fur.impl.LongFur;
import abstractfactory.cats.elements.tails.Tail;
import abstractfactory.cats.elements.tails.impl.LongTail;
import abstractfactory.cats.elements.tails.impl.ShortTail;

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
