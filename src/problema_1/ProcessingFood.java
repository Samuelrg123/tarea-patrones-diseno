package problema_1;

public class ProcessingFood extends GeneralProcessingStep implements OrderProcessingStrategy{
    public void specificStep() {
        System.out.println("Paso unico de ordenes de Comida despues de la verificacion de inventario");
    }

    @Override
    public final void orderProcessingStrategy() {
        verifyInventory();
        specificStep();
        billing();
        notifyCustomer();

    }
}
