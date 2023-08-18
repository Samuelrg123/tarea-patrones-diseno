package problema_3;

public interface construir_Pizza {

    void setTamano (String tamano);
    void setMasa (String masa);
    void addIngrediente (String ingrediente);
    void setExtraqueso (boolean extraqueso);

    pizza HacerPizza();
}
