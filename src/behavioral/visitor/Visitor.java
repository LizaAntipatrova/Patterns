package behavioral.visitor;

import behavioral.visitor.graphs.impl.Hyperbola;
import behavioral.visitor.graphs.impl.Parabola;
import behavioral.visitor.graphs.impl.Straight;

public interface Visitor {
    void visitStraight(Straight straight);

    void visitParabola(Parabola parabola);

    void visitHyperbola(Hyperbola hyperbola);
}
