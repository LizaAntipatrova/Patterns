package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

    List<Component> insides = new ArrayList<>();

    public void add(Component component) {
        insides.add(component);
    }

    public void remove(Component component) {
        insides.remove(component);
    }

    public List<Component> getInsides() {
        return insides;
    }

    @Override
    public double weigh() {
        double sumWeight = 0;
        for (Component component : insides) {
            sumWeight += component.weigh();
        }
        return sumWeight;
    }
}
