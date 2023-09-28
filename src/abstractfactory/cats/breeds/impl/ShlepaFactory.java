package abstractfactory.cats.breeds.impl;

import abstractfactory.cats.breeds.AbstractCatBreedFactory;
import abstractfactory.cats.elements.colors.FurColor;
import abstractfactory.cats.elements.colors.impl.BrownFur;
import abstractfactory.cats.elements.ears.Ear;
import abstractfactory.cats.elements.ears.impl.StandardEars;
import abstractfactory.cats.elements.faces.Face;
import abstractfactory.cats.elements.faces.impl.ElongatedFace;
import abstractfactory.cats.elements.fur.FurLength;
import abstractfactory.cats.elements.fur.impl.ShortFur;
import abstractfactory.cats.elements.tails.Tail;
import abstractfactory.cats.elements.tails.impl.LongTail;

public class ShlepaFactory extends AbstractCatBreedFactory {

    @Override
    public Tail addTail() {
        return new LongTail();
    }

    @Override
    public Ear addEars() {
        return new StandardEars();
    }

    @Override
    public FurLength addFurLength() {
        return new ShortFur();
    }

    @Override
    public FurColor addColor() {
        return new BrownFur();
    }

    @Override
    public Face addFace() {
        return new ElongatedFace();
    }
}
