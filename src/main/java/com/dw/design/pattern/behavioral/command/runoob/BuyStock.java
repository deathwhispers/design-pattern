package com.dw.design.pattern.behavioral.command.runoob;

/**
 * 命令的具体执行者
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/15 15:35
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}