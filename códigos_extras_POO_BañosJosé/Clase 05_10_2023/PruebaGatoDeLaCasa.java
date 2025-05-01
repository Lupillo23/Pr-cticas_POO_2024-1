public class PruebaGatoDeLaCasa {
    public static void main(String args[]){
        //Constructor con parámetros heredado de la clase padre y un parámetro "nombre" extra
        GatoDeLaCasa gato3 = new GatoDeLaCasa("tilinInsano", "Azul", 23);

        System.out.println("Nombre del gato 3: " + gato3.getNombre());
        System.out.println("Color del gato 3: " + gato3.getColor());
        System.out.println("Edad del gato 3: " + gato3.getEdad());
        gato3.comer();
        gato3.dormir();
        gato3.hablar();
        gato3.molestarALaKaren();

        //Constructor sin parámetros
        GatoDeLaCasa gato4 = new GatoDeLaCasa();

        System.out.println("Nombre del gato 4: " + gato4.getNombre());
        System.out.println("Color del gato 4: " + gato4.getColor());
        System.out.println("Edad del gato 4: " + gato4.getEdad());
        gato4.comer();
        gato4.dormir();
        gato4.hablar();
        gato4.molestarALaKaren();
    }
}
