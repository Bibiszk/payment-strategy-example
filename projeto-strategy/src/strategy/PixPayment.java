package strategy;

public class PixPayment implements PaymentStrategy {
    private String chavePix;

    public PixPayment(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado via PIX: " + chavePix);
    }
}
