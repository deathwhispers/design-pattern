package com.dw.design.pattern.behavioral.command.runoob;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/15 15:35
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
