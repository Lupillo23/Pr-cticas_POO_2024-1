/*Actividad3.java
 *@author José Baños
 *@author Jhonatan Amaya
 *@version 1.0
 */

/**
 * La clase Actividad3 es una aplicación que permite al usuario crear un objeto Corredor y mostrar sus datos.
 * Utiliza la clase Corredor para representar a un corredor y realizar operaciones con sus atributos.
 */
package poo.gp10;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("######## Creación de un objeto de tipo Corredor #######");

        // Solicitar al usuario que ingrese información para crear un objeto Corredor
        System.out.println("Ingrese:\nNombre:");
        String nombreNuevoCorredor = entrada.nextLine();
        System.out.println("Edad:");
        int edadNuevoCorredor = entrada.nextInt();
        System.out.println("Antigüedad: ");
        int antigüedadNuevoCorredor = entrada.nextInt();

        // Crear un nuevo objeto Corredor con la información proporcionada
        Corredor nuevoCorredor = new Corredor(nombreNuevoCorredor, edadNuevoCorredor, antigüedadNuevoCorredor, 2, 0, "s");

        // Mostrar los datos del Corredor creado
        System.out.println("###### Datos del Corredor ######");
        System.out.println("Nombre: " + nuevoCorredor.getNombre());
        System.out.println("Edad: " + nuevoCorredor.getEdad());
        System.out.println("Antigüedad: " + nuevoCorredor.antiguedad);
        System.out.println("Horas de entrenamiento: " + nuevoCorredor.getHorasDeEntrenamiento());
        System.out.println("Total de horas entrenadas : " + nuevoCorredor.getTotalHorasEntrenadas());
    }
}
