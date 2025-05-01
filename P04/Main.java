import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Ayudante ayudante1 = new Ayudante("Lucian");
        String respuesta1 = new String();
        
        Notificaciones.encabezado();

        System.out.println("Desea comprar alimento para el perrito que va a adoptar?");
        respuesta1 = entrada.nextLine();

        if(respuesta1.equalsIgnoreCase("si")){
            System.out.println("Cuántos kilos desea comprar??");
            String kilosDeAlimento = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Desea indicar las caracterpisticas del perrito que va a adoptar??");
            respuesta1 = entrada.nextLine();

            if(respuesta1.equalsIgnoreCase("si")){
                System.out.println("Edad del perrito: " );
                String edadNuevoPerrito = entrada.nextLine();
                System.out.println("Tamaño actual del perrito: ");
                String tamañoNuevoPerrito = entrada.nextLine();
                System.out.println("Tamaño máximo del perrito: ");
                String maxNuevoPerrito = entrada.nextLine();

                Perrito nuevoPerrito = new Perrito(edadNuevoPerrito, tamañoNuevoPerrito, maxNuevoPerrito);
            }
            else{
                Perrito nuevoPerrito = new Perrito();
            }

            ayudante1.traerUnPerrito(nuevoPerrito, kilosDeAlimento);
        }
        else{
            System.out.println("Desea indicar las caracteristicas del perrito que va a adoptar??");
            respuesta1 = entrada.nextLine();

            if(respuesta1.equalsIgnoreCase("si")){
                System.out.println("Edad del perrito: " );
                String edadNuevoPerrito = entrada.nextLine();
                System.out.println("Tamaño actual del perrito: ");
                String tamañoNuevoPerrito = entrada.nextLine();
                System.out.println("Tamaño máximo del perrito: ");
                String maxNuevoPerrito = entrada.nextLine();

                Perrito nuevoPerrito = new Perrito(edadNuevoPerrito, tamañoNuevoPerrito, maxNuevoPerrito);
            }
            else{
                Perrito nuevoPerrito = new Perrito();
            }

            ayudante1.traerUnPerrito(nuevoPerrito);
        }

        System.out.println("Desea ponerle un nuevo nombre al perrito??");
        respuesta1 = entrada.nextLine();
        if(respuesta1.equalsIgnoreCase("si")){
            System.out.println("Ingrese el nuevo nombre del perrito: ");
            String nombreNuevoPerrito = entrada.nextLine();
            nuevoPerrito.setNombreDelPerrito(nombreNuevoPerrito);
        }
        
        System.out.println("Nombre del perrito: " + getNombreDelPerrito);
        nuevoPerrito.lamerLaCara();
        nuevoPerrito.ladrar();
        
    }
}