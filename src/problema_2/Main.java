package problema_2;

public class Main {
    public static void main(String[] args) {
        ECommercePlatform ecommercePlatform = new ECommercePlatform(new PaymentAdapter(new ExternalPaymentSystem()));
        ecommercePlatform.processOrderPayment();

    }
}
