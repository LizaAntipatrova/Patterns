package builder.builders.impl;

import builder.builders.CatFamilyBuilder;
import builder.object.impl.Tiger;

public class TigerBuilder extends CatFamilyBuilder {
    Tiger tiger;

    @Override
    public void reset() {
        tiger = new Tiger();
    }

    @Override
    public void setLegs(String legs) {
        tiger.legs = "powerful " + legs;
    }

    @Override
    public void setColor(String color) {
        tiger.color = color;
    }

    @Override
    public void setFur(String fur) {
        tiger.fur = fur;
    }

    @Override
    public void setEyes(String eyes) {
        tiger.eyes = "threatening " + eyes;
    }

    @Override
    public void setSizeEars(String sizeEars) {
        tiger.sizeEars = sizeEars;
    }

    @Override
    public void setFormEars(String formEars) {
        tiger.formEars = formEars;
    }

    @Override
    public void setFeatures(String features) {
        tiger.features = features;
    }

    public Tiger getTiger() {
        return tiger;
    }
}
