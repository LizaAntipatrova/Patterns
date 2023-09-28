package builder.object.impl;

import builder.object.CatFamily;

public class HouseCat extends CatFamily {
    public void eatFish() {
        System.out.println("Tasty!");
    }

    @Override
    public String toString() {
        return "Cat has " + legs + " legs, " +
                color + " color, " +
                eyes + " eyes, " +
                sizeEars + " and " + formEars + " ears, " +
                fur + " fur, " +
                "its feature is " + features;
    }
}
