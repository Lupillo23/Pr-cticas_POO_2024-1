/**
 * Clase Ayudante
 * Describe las caracteristicas de una clase Ayudante y sus metodos
 * @author Jhonatan
 * @author José
 */
public class Ayudante{
    private String nombre;
    
    public Ayudante(String nombre){
        this.nombre = nombre;
    }

    public void traerUnPerrito(Perrito elPerrito){
        System.out.println("Aquí está su perrito");
        System.out.println("Se llama "+elPerrito.getNombre()+".");
        System.out.println("Tiene "+elPerrito.getEdadActual()+" años.");
        System.out.println("Es de tamaño "+elPerrito.getTamañoActual()+" y cuando sea mayor será de tamaño "+elPerrito.getTamañoMaximo()+".");
    }
    public void traerUnPerrito(Perrito elPerrito, int numKilos){
        System.out.println("Aquí está su perrito");
        System.out.println("Se llama "+elPerrito.getNombre()+".");
        System.out.println("Tiene "+elPerrito.getEdadActual()+" años.");
        System.out.println("Es de tamaño "+elPerrito.getTamañoActual()+" y cuando sea mayor será de tamaño "+elPerrito.getTamañoMaximo()+".");
        System.out.println("Y aquí están los "+numKilos+" kilos de comida para el perro que pidió.");
    }
}