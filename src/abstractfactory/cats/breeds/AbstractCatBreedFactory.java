package abstractfactory.cats.breeds;

import abstractfactory.cats.Cat;
import abstractfactory.cats.elements.colors.FurColor;
import abstractfactory.cats.elements.ears.Ear;
import abstractfactory.cats.elements.faces.Face;
import abstractfactory.cats.elements.fur.FurLength;
import abstractfactory.cats.elements.tails.Tail;

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