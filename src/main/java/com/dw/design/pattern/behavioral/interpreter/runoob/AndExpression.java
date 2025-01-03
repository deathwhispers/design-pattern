package com.dw.design.pattern.behavioral.interpreter.runoob;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/18 18:25
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
