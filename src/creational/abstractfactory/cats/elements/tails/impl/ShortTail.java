package creational.abstractfactory.cats.elements.tails.impl;

import creational.abstractfactory.cats.elements.tails.Tail;

public class ShortTail extends Tail {
    @Override
    public String getTail() {
        return "short tail";
    }
}
