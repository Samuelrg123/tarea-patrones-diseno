package problema_1;

public class ProcessingElectronic extends GeneralProcessingStep implements OrderProcessingStrategy{
    public void specificStep() {
        System.out.println("Paso unico de ordenes de Electronicos despues de la notificacion ");
    }

    @Override
    public final void orderProcessingStrategy() {
        verifyInventory();
        billing();
        notifyCustomer();
        specificStep();
    }
}
