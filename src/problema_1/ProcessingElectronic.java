package problema_1;

public class ProcessingElectronic implements OrderProcessingStrategy{

    @Override
    public void verifyInventory() {
        System.out.println("Revisando inventario de productos Electronicos");
    }

    @Override
    public void billing() {
        System.out.println("Facturando el producto Electronico");
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Notificando al cliente de su producto Electronico");
    }

    public void specificStep(){
        System.out.println("Paso unico de ordenes de Electronicos");
    }
    @Override
    public final void orderProcessingStrategy(){
        verifyInventory();
        billing();
        notifyCustomer();
        specificStep();
    }
}
