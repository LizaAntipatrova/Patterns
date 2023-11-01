package behavioral.visitor.graphs;

import behavioral.visitor.Visitor;

public interface Graph {
    void draw();

    void showFormula();

    void accept(Visitor visitor);
}
