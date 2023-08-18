package problema_3;

public class confirmar_Pizza implements construir_Pizza{
    private problema_3.pizza pizza = new pizza();
    @Override
    public void setTamano(String tamano) {
        pizza.setTamano(tamano);
    }
    @Override
    public void setMasa(String masa) {
        pizza.setMasa(masa);
    }
    @Override
    public void addIngrediente(String ingrediente) {
        pizza.addIngrediente(ingrediente);
    }

    @Override
    public void setExtraqueso(boolean extraqueso) {
        pizza.setExtraQueso(extraqueso);
    }
    @Override
    public problema_3.pizza HacerPizza() {
        return pizza;
    }
}
