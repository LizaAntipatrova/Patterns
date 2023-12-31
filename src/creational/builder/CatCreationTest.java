package creational.builder;

import creational.builder.builders.impl.TigerBuilder;

public class CatCreationTest {
    public static void main(String[] args) {
        CatDirector catDirector = new CatDirector();
        TigerBuilder builder = new TigerBuilder();
        builder.reset();
        catDirector.createAmurTiger(builder);
        System.out.println(builder.getTiger());
    }
}
