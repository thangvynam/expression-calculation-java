package ExpressionInterface;

import NotationInterface.Notation;

public interface Expression {
    public double evaluate(double x);
    public Expression  derive();
    public String ToString(Notation notation);
}
