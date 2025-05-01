public class PruebaGatoDeLaCalle {
    public static void main(String args[]){
        //gato1 constructor sin parámetros
        GatoDeLaCalle gato1 = new GatoDeLaCalle();//se heredan los miembros de la clase "Gato"
        System.out.println("Color del gato 1: " + gato1.getColor());
        System.out.println("Edad del gato 1: " + gato1.getEdad());
        gato1.comer();
        gato1.dormir();
        gato1.hablar();

        //gato2 constructor con parámetros
        GatoDeLaCalle gato2 = new GatoDeLaCalle("negro", 23);
        System.out.println("Color del gato 2: " + gato2.getColor());
        System.out.println("Edad del gato 2: " + gato2.getEdad());
        gato2.comer();
        gato2.dormir();
        gato2.hablar();
    }
}
