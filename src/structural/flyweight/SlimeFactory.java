package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class SlimeFactory {
    private static final List<Slime> slimes = new ArrayList<>();

    public static List<Slime> getSlimes() {
        return slimes;
    }

    public static Slime getSlime(SlimeType type) {
        Slime slime = slimes.stream().
                filter(current -> (type.nameFile.equals(current.getNameFile())
                        && type.color.equals(current.getColor())))
                .findFirst().orElse(null);
        if (slime == null) {
            slime = new Slime(type);
            slimes.add(slime);
        }
        return slime;
    }
}
