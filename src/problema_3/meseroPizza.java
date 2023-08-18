package problema_3;

public class meseroPizza {
    private construir_Pizza Construir_Pizza;

    public meseroPizza(construir_Pizza Construir_Pizza){
        this.Construir_Pizza = Construir_Pizza;
    }
    public pizza buildPizza(){
        Construir_Pizza.setTamano("pequeña");
        Construir_Pizza.setMasa("integral");
        Construir_Pizza.addIngrediente("queso");
        Construir_Pizza.addIngrediente("pepperoni");
        Construir_Pizza.setExtraqueso(true);

        return Construir_Pizza.HacerPizza();
    }
}
