package com.dw.design.pattern.behavioral.mediator;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom= new User("Tom");

        geely.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Geely");
    }


}
