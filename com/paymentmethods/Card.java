package com.paymentmethods;

import com.abstractclasses.Payment;
import com.interfaces.PaymentVisitor;

public class Card extends Payment {

    @Override
    public void accept(PaymentVisitor paymentVisitor) {
        paymentVisitor.visit(this);
    }
}
