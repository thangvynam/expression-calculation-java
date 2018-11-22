package ExpressionEnity;

import ExpressionInterface.Expression;
import java.lang.Math;

public class MonomialExp implements Expression {
    // a*x^b
    private double a ;
    private double b ;
    public MonomialExp() {
    }

    public MonomialExp(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double evaluate(double x) {
        return a*Math.pow(x,b*1.0);
    }

    public Expression derive() {
        if(b==1)
            return new ConsExp(a);
        return new MonomialExp(a*b,b-1);
    }

    public String ToString() {
        if(b==1)
            return a+ "x";
        return a+ "x^" + b;
    }
}
