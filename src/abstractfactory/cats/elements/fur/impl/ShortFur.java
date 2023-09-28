package abstractfactory.cats.elements.fur.impl;

import abstractfactory.cats.elements.fur.FurLength;

public class ShortFur extends FurLength {
    @Override
    public String getFurLength() {
        return "short fur";
    }
}
