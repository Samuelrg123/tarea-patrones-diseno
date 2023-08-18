package problema_1;

public class ProcessingClothing extends GeneralProcessingStep implements OrderProcessingStrategy{
    public void specificStep() {
        System.out.println("Paso unico de ordenes de Ropa antes de la notificacion");
    }

    @Override
    public final void orderProcessingStrategy() {
        verifyInventory();
        billing();
        specificStep();
        notifyCustomer();

    }
}
