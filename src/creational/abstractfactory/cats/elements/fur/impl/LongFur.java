package creational.abstractfactory.cats.elements.fur.impl;

import creational.abstractfactory.cats.elements.fur.FurLength;

public class LongFur extends FurLength {
    @Override
    public String getFurLength() {
        return "long fur";
    }
}
