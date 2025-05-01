package programa1;
/*
 * class Main
 * @author José Baños
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Estudiante[] listaDeEstudiantes = new Estudiante[5];
        String nombreDeEstudiante = new String();
        byte edad = 0;
        String carrera = new String();

        for(int numLista = 0; numLista < 5; numLista++){
            listaDeEstudiantes[numLista] = new Estudiante();

            System.out.println("Ingrese nombre del estudiante: ");
            nombreDeEstudiante = entrada.nextLine();
            listaDeEstudiantes[numLista].setNombre(nombreDeEstudiante);
            
            System.out.println("Edad: ");
            edad = entrada.nextByte();
            listaDeEstudiantes[numLista].setEdad(edad);

            entrada.nextLine();

            System.out.println("Carrera:");
            carrera = entrada.nextLine();
            listaDeEstudiantes[numLista].setCarrera(carrera);
        }

        System.out.println("************PASE DE LISTA**********");
        for(int numLista = 0; numLista < 5; numLista++){
            System.out.println("Estudiante " + numLista+1);
            System.out.println("Nombre del estudiante: " + listaDeEstudiantes[numLista].getNombre());
            System.out.println("Edad del estudiante: " + listaDeEstudiantes[numLista].getEdad());
            System.out.println("Carrera que cursa: " + listaDeEstudiantes[numLista].getCarrera());
        }

        entrada.close();
    }
}
