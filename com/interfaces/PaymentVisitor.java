package com.interfaces;

import com.paymentmethods.*;

public interface PaymentVisitor {
    public void visit(Object o);
}
