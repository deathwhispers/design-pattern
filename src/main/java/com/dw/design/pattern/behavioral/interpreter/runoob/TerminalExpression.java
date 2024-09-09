package com.dw.design.pattern.behavioral.interpreter.runoob;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/18 18:24
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
