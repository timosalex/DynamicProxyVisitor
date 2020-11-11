package com;

import com.interfaces.PaymentVisitor;
import com.paymentmethods.Pos;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static jdk.nashorn.internal.runtime.regexp.joni.constants.StackType.POS;

public class VisitorHandler implements InvocationHandler {
    private PrintPaymentVisitor pr;

    public VisitorHandler(PrintPaymentVisitor pr){
        this.pr=pr;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("* The dynamic proxy handler was called...");
        if (method.getName().equals("visit")) {
            pr.visit(new Pos());}
        else {
            System.err.println("Unsupported method: " + method.getName());
        }
        return null;
    }
}
