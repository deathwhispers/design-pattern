package com.guangjian.design.pattern.behavioral.command.runoob;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/15 16:05
 */
public class Test {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
