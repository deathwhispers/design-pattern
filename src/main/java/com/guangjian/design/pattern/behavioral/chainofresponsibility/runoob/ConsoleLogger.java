package com.guangjian.design.pattern.behavioral.chainofresponsibility.runoob;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/13 18:04
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
