package ExpressionEnity;

import ExpressionInterface.Expression;

public class AddExp extends BinaryExp {
    private boolean checkMinus  = false;
    protected double doEvaluate(double val1, double val2) {
        return val1+val2;
    }

    public AddExp() {
    }

    public AddExp(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }
    public AddExp(Expression exp1, Expression exp2,boolean checkMinus) {
        super(exp1, exp2);
        this.checkMinus = checkMinus;
    }

    public Expression derive() {
       return new AddExp(this.exp1.derive(),this.exp2.derive());
    }

    protected String getOperator() {
        if(checkMinus)
            return "-";
        return "+";
    }
}
