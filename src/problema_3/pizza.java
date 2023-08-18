package problema_3;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class pizza {

    private String tamano;
    private String borde;
    private String masa;
    private boolean extraQueso;
    private List<String> ingredientes;
    public pizza(){
        ingredientes = new ArrayList<>();
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }


    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public void addIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
    }


    public double calcularCosto(){

        double baseCosto = 0.0;
        double pizzaTamano=0.0;
        double ingredientCost = ingredientes.size() * 1.5;
        double quesoCost = extraQueso ? 2.0 : 0.0;

        return baseCosto + pizzaTamano + ingredientCost + quesoCost;

    }
    public void pizzaPrevia(){
        System.out.println("Tamaño: "+ tamano);
        System.out.println("Ingrediente:" + ingredientes);
        System.out.println("Masa: "+ masa);
        System.out.println("Queso Extra?: " + (extraQueso ? "Si":"No"));
        System.out.println("El precio total es: " + calcularCosto());
    }

}
