package builder;

import builder.builders.CatFamilyBuilder;

public class CatDirector {
    public CatFamilyBuilder createMunchkinCat(CatFamilyBuilder builder) {
        builder.setEyes("brown");
        builder.setColor("red,gray and white");
        builder.setFur("medium");
        builder.setFormEars("flappy");
        builder.setLegs("short");
        builder.setSizeEars("little");
        builder.setFeatures("always sneak up on you");
        return builder;
    }

    public CatFamilyBuilder createAmurTiger(CatFamilyBuilder builder) {
        builder.setEyes("green");
        builder.setColor("red,black and white");
        builder.setFur("soft");
        builder.setFormEars("round");
        builder.setLegs("big");
        builder.setSizeEars("little");
        builder.setFeatures("eat you if you don’t feed");
        return builder;
    }

}
