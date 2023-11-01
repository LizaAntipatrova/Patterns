package behavioral.visitor.graphs.impl;

import behavioral.visitor.Visitor;
import behavioral.visitor.graphs.Graph;

public class Straight implements Graph {
    double a;
    double b;

    public Straight(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Schedule straight");
    }

    @Override
    public void showFormula() {
        System.out.println("y = " + a + "x + " + b);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStraight(this);
    }
}
