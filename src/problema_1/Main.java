package problema_1;

public class Main {
    public static void main(String[] args) {
        OrderProcessingStrategy strategy;
        Order order = new Order();

        strategy = new ProcessingElectronic();
        order.processOrder(strategy);
        strategy = new ProcessingClothing();
        order.processOrder(strategy);
        strategy = new ProcessingFood();
        order.processOrder(strategy);

    }
}
