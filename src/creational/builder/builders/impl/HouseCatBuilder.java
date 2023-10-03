package creational.builder.builders.impl;

import creational.builder.builders.CatFamilyBuilder;
import creational.builder.object.impl.HouseCat;

public class HouseCatBuilder extends CatFamilyBuilder {

    private HouseCat cat;


    @Override
    public void reset() {
        cat = new HouseCat();
    }

    @Override
    public void setLegs(String legs) {
        cat.legs = "cute " + legs;
    }

    @Override
    public void setColor(String color) {
        cat.color = "cute " + color;
    }

    @Override
    public void setFur(String fur) {
        cat.fur = "cute " + fur;
    }

    @Override
    public void setEyes(String eyes) {
        cat.eyes = "cute " + eyes;
    }

    @Override
    public void setSizeEars(String sizeEars) {
        cat.sizeEars = "cute " + sizeEars;
    }

    @Override
    public void setFormEars(String formEars) {
        cat.formEars = "cute " + formEars;
    }

    @Override
    public void setFeatures(String features) {
        cat.features = "cute " + features;
    }

    public HouseCat getHouseCat() {
        return cat;
    }
}
