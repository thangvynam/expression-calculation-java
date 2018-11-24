package NotationEnity;

import NotationInterface.Notation;

/**
 * @author namtv3
 */
public class PrefixNotation implements Notation {
    public String arrange(String operator, String operand1, String operand2) {
        return operator + " " + operand1 + " " +  operand2;
    }
}
