import com.PrintPaymentVisitor;
import com.abstractclasses.Payment;
import com.paymentmethods.Card;
import com.paymentmethods.Cash;
import com.paymentmethods.Check;
import com.paymentmethods.Pos;

public class VisitorDynamicProxy {

    public static void main(String[] args) {
        Payment[] payment=new Payment[]{new Check(),new Card(),new Cash(),new Pos()};
        PrintPaymentVisitor printPaymentVisitor=new PrintPaymentVisitor();
        for(Payment p : payment){
            p.accept(printPaymentVisitor);
        }

    }

}
