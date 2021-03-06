package ExpressionEnity;

import ExpressionInterface.Expression;
import NotationInterface.Notation;

import java.lang.Math;

public class MonomialExp implements Expression {
    // a*x^b
    private double a;
    private double b;

    public static Expression createInstance(double a,double b){
        if(a == 0)
            return new ConsExp(0);
        if(b == 0)
            return new  ConsExp(a);
        return new MonomialExp(a,b);
    }
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
        if(b==0)
            return new ConsExp(0);
        if(b==1)
            return new ConsExp(a);
        return new MonomialExp(a*b,b-1);
    }

    public String ToString(Notation notation) {
        /*if(a==0)
            return "0.0";*/
        if(b==1)
            return a+ "*x";
        /*if(b==0)
            return a +"";*/
        return a+ "*x^" + b;
    }
}
