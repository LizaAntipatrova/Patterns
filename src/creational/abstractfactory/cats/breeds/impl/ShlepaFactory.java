package creational.abstractfactory.cats.breeds.impl;

import creational.abstractfactory.cats.breeds.AbstractCatBreedFactory;
import creational.abstractfactory.cats.elements.colors.FurColor;
import creational.abstractfactory.cats.elements.colors.impl.BrownFur;
import creational.abstractfactory.cats.elements.ears.Ear;
import creational.abstractfactory.cats.elements.ears.impl.StandardEars;
import creational.abstractfactory.cats.elements.faces.Face;
import creational.abstractfactory.cats.elements.faces.impl.ElongatedFace;
import creational.abstractfactory.cats.elements.fur.FurLength;
import creational.abstractfactory.cats.elements.fur.impl.ShortFur;
import creational.abstractfactory.cats.elements.tails.Tail;
import creational.abstractfactory.cats.elements.tails.impl.LongTail;

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
