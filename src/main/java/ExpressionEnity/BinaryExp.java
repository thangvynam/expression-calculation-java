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
        if(op.equals("+")){
            if (exp1.ToString().equals("0.0"))
                return exp2.ToString();
            if (exp2.ToString().equals("0.0"))
                return exp1.ToString();
        }
        if(op.equals("*")){
            if(exp1.ToString().equals("0.0") || exp2.ToString().equals("0.0"))
                return "0.0";
        }
        if(op.equals("/")){

        }
        return "(" + exp1.ToString()+" " + op + " " + exp2.ToString() + ")";

    }
    protected abstract String getOperator();


}
