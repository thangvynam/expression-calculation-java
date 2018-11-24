package NotationEnity;

import NotationInterface.Notation;

/**
 * @author namtv3
 */
public class PostfxNotation implements Notation {
    public String arrange(String operator, String operand1, String operand2) {
        return operand1 + " " + operand2 + " "+ operator;
    }
}
