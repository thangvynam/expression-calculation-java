package main;

import ExpressionEnity.*;
import ExpressionInterface.Expression;
import NotationEnity.InfixNotation;
import NotationEnity.PostfxNotation;
import NotationEnity.PrefixNotation;

public class Main {
    public static void main(String[] args) {
        InfixNotation infixNotation = new InfixNotation();
        PrefixNotation prefixNotation = new PrefixNotation();
        PostfxNotation postfxNotation = new PostfxNotation();

        /*ConsExp consExp = new ConsExp(7);
        System.out.println(consExp.evaluate(2));
*/
        //MonomialExp monomialExp = new MonomialExp(0,5);
       /* Expression monomialExp = MonomialExp.createInstance(0,5);
        System.out.println(monomialExp.ToString(infixNotation));*/
        //System.out.println(monomialExp.derive().ToString());
        //System.out.println(monomialExp.derive().evaluate(2));

        /*AddExp addExp = new AddExp(new MonomialExp(2,8),new MonomialExp(2,10.2));
        System.out.println(addExp.derive().ToString(postfxNotation));*/

        /*MulExp mulExp = new MulExp( new MonomialExp(10,5), new MonomialExp(5,0));
        System.out.println(mulExp.derive().ToString());*/

        DivExp divExp = new DivExp(new MonomialExp(2,5),new MonomialExp(2,2));
        System.out.println(divExp.derive().ToString(prefixNotation));
        System.out.println(divExp.derive().evaluate(2));

    }
}

