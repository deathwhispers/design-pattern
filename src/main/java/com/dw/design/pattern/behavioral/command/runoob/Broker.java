package com.dw.design.pattern.behavioral.command.runoob;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/15 15:35
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}