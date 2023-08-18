package problema_3;
public class main {
    public static void main(String[] args) {

        construir_Pizza nuevaPizza = new confirmar_Pizza();
        meseroPizza mesero = new meseroPizza(nuevaPizza);

        pizza nuevoPedido = mesero.buildPizza();
        nuevoPedido.pizzaPrevia();
    }
}