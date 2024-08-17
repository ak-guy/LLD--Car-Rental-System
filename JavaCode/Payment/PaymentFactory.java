package JavaCode.Payment;

public class PaymentFactory {


    public Payment getPaymentObject(PaymentMode paymentMode) {
        
        switch (paymentMode) {
            case CASH:
                return new CashPayement();
            case CREDITCARD:
                return new CreditCardPayment();
            case DEBITCARD:
                return new DebitCardPayment();
            case UPI:
                return new UPIPayment();

            default:
                throw new IllegalArgumentException("Unkown Payment Mode " + paymentMode);
        }
    }
}
