package com.interfaces;

import com.paymentmethods.*;

public interface PaymentVisitor {

    public void visit(Pos pos);
    public void visit(Cash cash);
    public void visit(Card card);
    public void visit(Check check);
}
