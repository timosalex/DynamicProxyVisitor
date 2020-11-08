package com;

import com.interfaces.PaymentVisitor;
import com.paymentmethods.Card;
import com.paymentmethods.Cash;
import com.paymentmethods.Check;
import com.paymentmethods.Pos;

public class PrintPaymentVisitor implements PaymentVisitor {
    @Override
    public void visit(Pos pos) {
        System.out.println("I am paying via POS");
    }

    @Override
    public void visit(Cash cash) {
        System.out.println("I am paying via Cash");
    }

    @Override
    public void visit(Card card) {
        System.out.println("I am paying via Card");
    }

    @Override
    public void visit(Check check) {
        System.out.println("I am paying via Check");
    }


}
