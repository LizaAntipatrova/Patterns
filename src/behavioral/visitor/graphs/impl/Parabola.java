package behavioral.visitor.graphs.impl;

import behavioral.visitor.Visitor;
import behavioral.visitor.graphs.Graph;

public class Parabola implements Graph {
    double a;
    double b;
    double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void draw() {
        System.out.println("Parabola chart");
    }

    @Override
    public void showFormula() {
        System.out.println("y = " + a + "x^2 + " + b + "x + " + c);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParabola(this);
    }
}
