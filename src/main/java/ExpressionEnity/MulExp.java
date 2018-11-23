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

        return new AddExp(new MulExp(exp1.derive(),exp2),new MulExp(exp2.derive(),exp1));

    }

    protected String getOperator() {
        return "*";
    }
}
