package main;

import ExpressionEnity.*;

public class Main {
    public static void main(String[] args) {
        /*ConsExp consExp = new ConsExp();
        System.out.println(consExp.evaluate(2));*/

       /* MonomialExp monomialExp = new MonomialExp(0,1);
        System.out.println(monomialExp.ToString());*/

        /*AddExp addExp = new AddExp(new MonomialExp(2,8),new MonomialExp(2,10.2));
        System.out.println(addExp.derive().ToString());*/

        /*MulExp mulExp = new MulExp( new MonomialExp(10,5), new MonomialExp(5,0));
        System.out.println(mulExp.derive().ToString());*/

        DivExp divExp = new DivExp(new ConsExp(2),new ConsExp(5));
        System.out.println(divExp.derive().ToString());


    }
}

