package ExpressionEnity;

import ExpressionInterface.Expression;

public class AddExp extends BinaryExp {
    protected double doEvaluate(double val1, double val2) {
        return val1+val2;
    }

    public AddExp() {
    }

    public AddExp(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    public Expression derive() {
       return new AddExp(this.exp1.derive(),this.exp2.derive());
    }

    protected String getOperator() {
        return "+";
    }
}
