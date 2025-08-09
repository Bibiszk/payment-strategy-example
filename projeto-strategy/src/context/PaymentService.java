package context;

import strategy.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Nenhuma forma de pagamento selecionada.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
