package behavioral.visitor.impl;

import behavioral.visitor.Visitor;
import behavioral.visitor.graphs.impl.Hyperbola;
import behavioral.visitor.graphs.impl.Parabola;
import behavioral.visitor.graphs.impl.Straight;

public class GraphExportVisitor implements Visitor {
    @Override
    public void visitStraight(Straight straight) {
        System.out.println("Export straight");
    }

    @Override
    public void visitParabola(Parabola parabola) {
        System.out.println("Export parabola");

    }

    @Override
    public void visitHyperbola(Hyperbola hyperbola) {
        System.out.println("Export hyperbola");

    }
}
