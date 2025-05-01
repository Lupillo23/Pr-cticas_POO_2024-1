package programa2;
/*
 * class Orden
 * @author José Baños
 */
public class Orden {
    private int numeroDePizzas;
    private float precioTotal;

    // Constructor
    public Orden(int numeroDePizzas) {
        this.numeroDePizzas = numeroDePizzas;
        this.precioTotal = 99.9f * numeroDePizzas;
    }

    // Getter para precioTotal
    public float getPrecioTotal() {
        return precioTotal;
    }
}
