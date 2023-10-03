package creational.abstractfactory.cats.elements.tails.impl;

import creational.abstractfactory.cats.elements.tails.Tail;

public class LongTail extends Tail {
    @Override
    public String getTail() {
        return "long tail";
    }
}
