/**
 * Clase Ejercicio02
 * Pregunta por el tipo de mascota del usuario y sus datos,posteriormete "baña" a la mascota e imprime los datos
 * @author Jhonatan
 * @author José
 */
import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String respuesta = new String();
        System.out.println("##### SPA PARA MASCOTAS #####");
        System.out.println("Para iniciar escriba en la terminal que tipo de mascota tiene ¿Gato o Perro?");
        respuesta = entrada.nextLine();
        if(respuesta.equalsIgnoreCase("Gato")){
            Gato michi = new Gato();
            System.out.println("Porvafor ingrese el nombre de su gato:");
            michi.nombre = entrada.nextLine();
            System.out.println("Ahora ingrese el color de su gato:");
            michi.color = entrada.nextLine();
            System.out.println("En unos momentos uno de nuestros trabajadores bañara a su gato.");
            Trabajador.baniarMascota(michi);
        }
        else if (respuesta.equalsIgnoreCase("Perro")){
            Perro lomito = new Perro();
            System.out.println("Porvafor ingrese el nombre de su lomito:");
            lomito.nombre = entrada.nextLine();
            System.out.println("Ahora ingrese el tamaño de su lomito:");
            lomito.tamanio = entrada.nextLine();
            System.out.println("En unos momentos uno de nuestros trabajadores bañara a su lomito.");
            Trabajador.baniarMascota(lomito);
        }
        else{
            System.out.println("Parece que ha ingresado una respuesta incorrecta.Porfavor reinicie el programa");
        }
        entrada.close();
    }
}