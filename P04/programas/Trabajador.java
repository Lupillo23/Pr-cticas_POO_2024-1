/**
 * Clase Trabajador
 * Describe las caracteristicas de una clase Trabajador y sus metodos
 * @author Jhonatan
 * @author José
 */
public class Trabajador{

    public static void baniarMascota(Gato elGato){
        System.out.println("*Se usa una tina y shampoo para gato*");
        System.out.println("*se baña al michi "+elGato.nombre+" de color "+elGato.color+" y se seca*");
        elGato.maullar();    
    }
    public static void baniarMascota(Perro elPerro){
        System.out.println("*se usa una plataforma, un collar y shampoo para perro*");
        System.out.println("*se baña al lomito "+elPerro.nombre+" de tamaño "+elPerro.tamanio+" y se seca*");
        elPerro.aullar(); 
    }
}