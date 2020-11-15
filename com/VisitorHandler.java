package com;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class VisitorHandler implements InvocationHandler {
    private PrintPaymentVisitor pr;

    public VisitorHandler(PrintPaymentVisitor pr){
        this.pr=pr;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("* The dynamic proxy handler was called...");
        if (method.getName().equals("visit")) {
            pr.visit((Object)args[0]);}
        else {
            System.err.println("Unsupported method: " + method.getName());
        }
        return null;
    }
}
