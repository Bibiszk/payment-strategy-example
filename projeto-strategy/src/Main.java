import context.PaymentService;
import strategy.CreditCardPayment;
import strategy.PayPalPayment;
import strategy.PixPayment;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        // Pagamento com cartão de crédito
        service.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        service.processPayment(250.0);

        // Pagamento via PayPal
        service.setPaymentStrategy(new PayPalPayment("usuario@email.com"));
        service.processPayment(100.0);

        // Pagamento via PIX
        service.setPaymentStrategy(new PixPayment("chave-pix-aleatoria"));
        service.processPayment(50.0);
    }
}
