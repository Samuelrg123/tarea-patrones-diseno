package problema_2;

public class ECommercePlatform {
    private PaymentProvider paymentProvider;

    public ECommercePlatform(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void processOrderPayment() {
        // Lógica de procesamiento de pago
        paymentProvider.processPayment();
    }

}
