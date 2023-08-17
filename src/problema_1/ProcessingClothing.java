package problema_1;

public class ProcessingClothing implements OrderProcessingStrategy{

    @Override
    public void verifyInventory() {
        System.out.println("Revisando inventario de productos Ropa");
    }

    @Override
    public void billing() {
        System.out.println("Facturando el producto Ropa");
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Notificando al cliente de su producto Ropa");
    }
    public void specificStep(){
        System.out.println("Paso unico de ordenes de Ropa");
    }
    @Override
    public final void orderProcessingStrategy(){
        verifyInventory();
        billing();
        notifyCustomer();
        specificStep();
    }
}
