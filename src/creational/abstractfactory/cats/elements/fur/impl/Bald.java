package creational.abstractfactory.cats.elements.fur.impl;

import creational.abstractfactory.cats.elements.fur.FurLength;

public class Bald extends FurLength {
    @Override
    public String getFurLength() {
        return "not fur T-T";
    }
}
