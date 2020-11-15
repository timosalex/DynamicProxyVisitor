package com;


public class PrintPaymentVisitor {

    public void visit(Object obj) {
        System.out.println("I am paying via: "+ obj.getClass().getName());
    }

}
