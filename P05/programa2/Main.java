package programa2;
/*
 * class Main
 * @author José Baños
 */
public class Main {
    public static void main(String[] args) {
        String nombreDelCliente = "pepe";
        int numeroDePizzas = 3;
        Cliente cliente1 = new Cliente(nombreDelCliente, numeroDePizzas);
        float precioTotal = cliente1.getOrden().getPrecioTotal();

        System.out.println("Nombre del cliente: " + nombreDelCliente);
        System.out.println("Orden:");
        System.out.println("Numero de pizzas: " + numeroDePizzas);
        System.out.println("Precio total: " + precioTotal);
    }
}


