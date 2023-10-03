package creational.abstractfactory.cats.breeds;

import creational.abstractfactory.cats.Cat;
import creational.abstractfactory.cats.elements.colors.FurColor;
import creational.abstractfactory.cats.elements.ears.Ear;
import creational.abstractfactory.cats.elements.faces.Face;
import creational.abstractfactory.cats.elements.fur.FurLength;
import creational.abstractfactory.cats.elements.tails.Tail;

public abstract class AbstractCatBreedFactory {
    protected abstract Tail addTail();

    protected abstract Ear addEars();

    protected abstract FurLength addFurLength();

    protected abstract FurColor addColor();

    protected abstract Face addFace();

    public Cat catAssembly() {
        return new Cat(addTail().getTail(),
                addColor().getColor(),
                addFace().getFace(),
                addEars().getEars(),
                addFurLength().getFurLength());
    }

}