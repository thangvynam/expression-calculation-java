package ExpressionEnity;

import ExpressionInterface.Expression;

public class DivExp extends BinaryExp {
    protected double doEvaluate(double val1, double val2) {
        if(val2 == 0)
            return 0;
        return val1/val2;
    }

    public Expression derive() {
        return new DivExp(new AddExp(new MulExp(exp1.derive(),exp2),new MulExp(exp2.derive(),exp1),true)
                         ,new MulExp(exp2,exp2));
    }

    public DivExp(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    public DivExp() {
    }

    protected String getOperator() {
        return "/";
    }
}
