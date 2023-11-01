package behavioral.visitor;

import behavioral.visitor.graphs.Graph;
import behavioral.visitor.graphs.impl.Hyperbola;
import behavioral.visitor.graphs.impl.Parabola;
import behavioral.visitor.graphs.impl.Straight;
import behavioral.visitor.impl.GraphExportVisitor;

import java.util.ArrayList;
import java.util.List;

public class TestVisitor {
    public static void main(String[] args) {
        List<Graph> graphs = new ArrayList<>();
        graphs.add(new Hyperbola(1, 1));
        graphs.add(new Parabola(1, 2, 1));
        graphs.add(new Straight(2, 3));
        Visitor exportVisitor = new GraphExportVisitor();

        for (Graph graph : graphs) {
            graph.draw();
            graph.showFormula();
            graph.accept(exportVisitor);
            System.out.println();
        }
    }
}
