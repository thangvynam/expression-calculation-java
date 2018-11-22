package ExpressionEnity;

import ExpressionInterface.Expression;

public abstract class BinaryExp implements Expression{
    protected Expression exp1;
    protected Expression exp2;

    public BinaryExp() {
    }
    public BinaryExp(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    public double evaluate(double x) {
        double val1 = exp1.evaluate(x);
        double val2 = exp2.evaluate(x);
        return doEvaluate(val1,val2);
    }

    protected abstract double doEvaluate(double val1, double val2);
    public abstract Expression derive();

    public String ToString() {
        String op = getOperator();
        return "(" + exp1.ToString()+" " + op + " " + exp2.ToString() + ")";
    }

    protected abstract String getOperator();


}
