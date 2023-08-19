package problema_1;

public abstract class GeneralProcessingStep {
    public final void verifyInventory() {
        System.out.println("Revisando inventario de productos");
    }

    public final void billing() {
        System.out.println("Facturando el producto");
    }

    public final void notifyCustomer() {
        System.out.println("Notificando al cliente de su producto");
    }
}
