package main;

import ExpressionEnity.*;

public class Main {
    public static void main(String[] args) {
        /*ConsExp consExp = new ConsExp(7);
        System.out.println(consExp.evaluate(2));
*/
        /*MonomialExp monomialExp = new MonomialExp(2,5);
        System.out.println(monomialExp.derive().ToString());
        System.out.println(monomialExp.derive().evaluate(2));*/

        /*AddExp addExp = new AddExp(new MonomialExp(2,8),new MonomialExp(2,10.2));
        System.out.println(addExp.derive().ToString());*/

        /*MulExp mulExp = new MulExp( new MonomialExp(10,5), new MonomialExp(5,0));
        System.out.println(mulExp.derive().ToString());*/

        DivExp divExp = new DivExp(new MonomialExp(2,5),new MonomialExp(2,2));
        System.out.println(divExp.derive().ToString());
        System.out.println(divExp.derive().evaluate(2));




    }
}

