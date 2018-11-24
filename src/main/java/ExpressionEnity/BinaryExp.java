package ExpressionEnity;

import ExpressionInterface.Expression;
import NotationInterface.Notation;
import Utils.ServiceUtils;

import java.util.Map;

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

    public String ToString(Notation notation) {
       /* String op = getOperator();
        if(op.equals("+")){
            if (exp1.ToString(notation).equals("0.0"))
                return exp2.ToString(notation);
            if (exp2.ToString(notation).equals("0.0"))
                return exp1.ToString(notation);
        }
        if(op.equals("*")){
            if(exp1.ToString(notation).equals("0.0") || exp2.ToString(notation).equals("0.0"))
                return "0.0";
        }
        if(op.equals("/")){
            String[] str = exp1.ToString(notation).split("-");

            str[0]=ServiceUtils.replace(str[0]);
            str[1]=ServiceUtils.replace(str[1]);
            Map<Boolean,Double> value1 = ServiceUtils.convertStringToDouble(str[0]);
            Map<Boolean,Double> value2 = ServiceUtils.convertStringToDouble(str[1]);
            if(value1.containsKey(true) && value2.containsKey(true) ){
                if(value1.get(true) == 0.0 && value2.get(true) == 0.0)
                    return "0.0";
            }
            if(value1.containsKey(false) && value2.containsKey(true) ){
                if(value2.get(true) == 0.0)
                    return str[0]+ op + " " + exp2.ToString(notation);
            }
            if(value1.containsKey(true) && value2.containsKey(false) ){
                if(value1.get(true) == 0.0)
                    return "-"+str[1]+ op + " " + exp2.ToString(notation);
            }
        }
        return "(" + exp1.ToString(notation)+" " + op + " " + exp2.ToString(notation) + ")";*/
       String operator = getOperator();
       String operand1 = exp1.ToString(notation);
       String operand2 = exp2.ToString(notation);
       return notation.arrange(operator,operand1,operand2);

    }
    protected abstract String getOperator();


}
