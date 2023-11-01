package structural.facade;

import structural.facade.food.*;
import structural.facade.food.souse.Souse;
import structural.facade.food.souse.impl.Ketchup;

import java.util.List;

public class Sandwich {
    private final Bread bread;
    private final Souse souse;
    private final Sausage sausage;
    private final Cheese cheese;
    private final Tomato tomato;
    private final Salad salad;

    public Sandwich() {
        this.bread = new Bread();
        this.souse = new Ketchup();
        this.sausage = new Sausage();
        this.cheese = new Cheese();
        this.tomato = new Tomato();
        this.salad = new Salad();

    }

    public List<String> createSandwich() {
        bread.cutSlice();
        bread.putOn(souse);
        bread.putOn(sausage);
        bread.putOn(cheese);
        bread.putOn(tomato);
        bread.putOn(salad);
        bread.cutSlice();
        return bread.getInside();
    }
}
