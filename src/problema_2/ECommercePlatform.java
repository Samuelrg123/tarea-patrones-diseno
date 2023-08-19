package problema_2;

public class ECommercePlatform {
    private PaymentProvider paymentProvider;


    public void setPaymentProvider(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }
    public void processOrderPayment() {
        // Lógica de procesamiento de pago
        paymentProvider.processPayment();
    }

}
