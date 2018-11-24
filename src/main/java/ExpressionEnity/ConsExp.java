package ExpressionEnity;

import ExpressionInterface.Expression;
import NotationInterface.Notation;

public class ConsExp implements Expression {
    private double value = 0;

    public ConsExp(double value) {
        this.value = value;
    }

    public ConsExp() {
    }

    public double evaluate(double x) {
        return this.value;
    }
    public Expression derive() {
        return new ConsExp(0);
    }

    public String ToString(Notation notation) {
        return this.value + "";
    }
}
