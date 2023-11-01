package structural.facade.food;

import java.util.ArrayList;
import java.util.List;

public class Bread implements Edible {
    private final List<String> inside = new ArrayList<>();

    public List<String> getInside() {
        return inside;
    }

    public void cutSlice() {
        inside.add(this.getFood());
    }

    @Override
    public String getFood() {
        return "bread";
    }

    public void putOn(Edible food) {
        inside.add(food.getFood());
    }
}
