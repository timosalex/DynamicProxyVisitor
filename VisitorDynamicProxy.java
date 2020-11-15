import com.PrintPaymentVisitor;
import com.VisitorHandler;
import com.abstractclasses.Payment;
import com.interfaces.PaymentVisitor;
import com.paymentmethods.Card;
import com.paymentmethods.Cash;
import com.paymentmethods.Check;
import com.paymentmethods.Pos;

import java.lang.reflect.Proxy;

public class VisitorDynamicProxy {

    public static void main(String[] args) {
        Payment[] payment=new Payment[]{new Check(),new Card(),new Cash(),new Pos()};
        PrintPaymentVisitor printPaymentVisitor=new PrintPaymentVisitor();
        Class[] interfaces = new Class[1];
        interfaces[0]= PaymentVisitor.class;
        PaymentVisitor proxy=(PaymentVisitor) Proxy.newProxyInstance(VisitorDynamicProxy.class.getClassLoader(),
                interfaces, new VisitorHandler(printPaymentVisitor));
        for(Payment p : payment) {
            proxy.visit(p);
        }

    }

}
