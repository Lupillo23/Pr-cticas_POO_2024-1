package programa2;
/*
 * clas Cliente
 * @author José Baños
 */
public class Cliente {
    private String nombre;
    private Orden orden1;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Orden getOrden() {
        return orden1;
    }

    // Constructor
    public Cliente(String nombre, int numeroDePizzas) {
        this.nombre = nombre;
        this.orden1 = new Orden(numeroDePizzas);
    }
}
