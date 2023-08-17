package problema_2;

public class Main {
    public static void main(String[] args) {
        ExternalPaymentSystem externalPaymentSystem = new ExternalPaymentSystem();
        PaymentAdapter paymentAdapter = new PaymentAdapter(externalPaymentSystem);

        ECommercePlatform ecommercePlatform = new ECommercePlatform();
        ecommercePlatform.setPaymentProvider(paymentAdapter);
        ecommercePlatform.processOrderPayment();

    }
}
