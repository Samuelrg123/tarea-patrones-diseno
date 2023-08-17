package problema_2;

public class PaymentAdapter implements PaymentProvider {
    private ExternalPaymentSystem paymentProvider;

    public PaymentAdapter(ExternalPaymentSystem paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    @Override
    public void processPayment() {
        paymentProvider.performExternalPayment();
    }
}
