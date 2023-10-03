package creational.abstractfactory.cats.elements.fur.impl;

import creational.abstractfactory.cats.elements.fur.FurLength;

public class ShortFur extends FurLength {
    @Override
    public String getFurLength() {
        return "short fur";
    }
}
