package com.abstractclasses;

import com.interfaces.PaymentVisitor;

public abstract class Payment {

    public abstract void accept(PaymentVisitor paymentVisitor);

}
