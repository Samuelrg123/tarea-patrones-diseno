package problema_1;

public class ProcessingFood implements OrderProcessingStrategy{

    @Override
    public void verifyInventory() {
        System.out.println("Revisando inventario de productos Comida");
    }

    @Override
    public void billing() {
        System.out.println("Facturando el producto Comida");
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Notificando al cliente de su producto Comida");
    }
    public void specificStep(){
        System.out.println("Paso unico de ordenes de Comida");
    }
    @Override
    public final void orderProcessingStrategy(){
        verifyInventory();
        billing();
        notifyCustomer();
        specificStep();
    }
}
