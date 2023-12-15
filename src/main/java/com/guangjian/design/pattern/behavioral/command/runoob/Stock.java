package com.guangjian.design.pattern.behavioral.command.runoob;

/**
 * 命令的接收者
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/15 15:34
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }

}
