/**
 * Clase AdopcionDePerritos
 * pregunta al usario por informacion para "adoptar" un perrito
 * @author Jhonatan
 * @author José
 */
import java.util.Scanner;
public class AdopcionDePerritos{
    public static void main(String[] args){
        int edad = 0;
        String tamañoActual = new String();
        String tamañoMaximo = new String();
        int kilos = 0;
        Scanner entrada = new Scanner(System.in);
        String respuestaComida = new String();
        String respuesta = new String();
        String nombre = new String();
        Ayudante lucian = new Ayudante("Lucían");
        Perrito perritoAdoptado;
        Notificaciones.encabezado();

        System.out.println("¿Quiere comprar alimento para el perrito que va a adoptar?");
        respuestaComida = entrada.next();
        if(respuestaComida.equalsIgnoreCase("SI")){
            System.out.println("¿Cuantos kilos de alimento quiere?");
            kilos = entrada.nextInt();
        }
        else{
            System.out.println("Vale.sigamos con la adopción ^^.");
        }

        System.out.println("¿Quiere inidicar las características del perrito que va a adoptar?");
        respuesta = entrada.next();

        if(respuesta.equalsIgnoreCase("SI")){
            System.out.println("Vale. Indique la edad que quiere para el perrito:");
            edad = entrada.nextInt();
            System.out.println("Ahora indique el tamaño actual que quiere para el perrito:");
            tamañoActual = entrada.next();
            System.out.println("Por utlimo indique el tamaño maximo que quiere que tenga el perrito cuando sea mayor:");
            tamañoMaximo = entrada.next();
            perritoAdoptado = new Perrito(edad,tamañoActual,tamañoMaximo);
        }
        else{
            System.out.println("Vale.Sigamos con la adopción ^^.");
            perritoAdoptado = new Perrito();
        }

        if(respuestaComida.equalsIgnoreCase("Si")){
            lucian.traerUnPerrito(perritoAdoptado,kilos);
        }
        else{
            lucian.traerUnPerrito(perritoAdoptado);
        }
        
        System.out.println("¿Quiere darle un nuevo nombre al perrito?");
        respuesta = entrada.next();
        entrada.nextLine();

        if(respuesta.equalsIgnoreCase("sI")){
            System.out.println("¿Cual va a ser el nuevo nombre del perrito?");
            nombre = entrada.nextLine();
            perritoAdoptado.setNombre(nombre);
        }
        else{
            System.out.println("Vale.Sigamos con la adopcion ^^");
        }
        System.out.println("Conosca a "+perritoAdoptado.getNombre()+" su nuevo perrito ^^.");
        perritoAdoptado.lamerCara();
        entrada.close();
    }
}