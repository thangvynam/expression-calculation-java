package ExpressionEnity;

import ExpressionInterface.Expression;

public class MulExp extends BinaryExp {
    protected double doEvaluate(double val1, double val2) {
        return val1*val2;
    }

    public MulExp(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    public MulExp() {
    }

    public Expression derive() {
        //return new AddExp(this.exp1.derive().,this.exp2.derive());
        return null;
    }

    protected String getOperator() {
        return null;
    }
}
