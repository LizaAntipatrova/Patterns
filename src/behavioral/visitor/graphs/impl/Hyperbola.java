package behavioral.visitor.graphs.impl;

import behavioral.visitor.Visitor;
import behavioral.visitor.graphs.Graph;

public class Hyperbola implements Graph {
    double a;
    double b;

    public Hyperbola(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Hyperbola graph");
    }

    @Override
    public void showFormula() {
        System.out.println("x^2/" + a * a + " - y^2/" + b * b + " = 1");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitHyperbola(this);
    }
}
