package main;

import ExpressionEnity.AddExp;
import ExpressionEnity.ConsExp;

public class Main {
    public static void main(String[] args) {
        AddExp a = new AddExp(new ConsExp(0),new ConsExp(1) );
        System.out.println(a.derive().ToString());
    }
}

