package builder.object.impl;

import builder.object.CatFamily;

public class Tiger extends CatFamily {
    public void eatPeople() {
        System.out.println("Tasty!");
    }

    @Override
    public String toString() {
        return "Tiger has " + legs + " legs, " +
                color + " color, " +
                eyes + " eyes, " +
                sizeEars + " and " + formEars + " ears, " +
                fur + " fur, " +
                "its feature is " + features;
    }
}
