public class Main {
    public static void main(String args[]){
        Acciones acciones1 = new Acciones();
        Persona persona1 = new Persona("Azul", "comprarComida", acciones1);
        Persona persona2 = new Persona("Chris", "comprarBoletos", acciones1);
        Thread hilo1 = new Thread(persona1);
        Thread hilo2 = new Thread(persona2);
        hilo1.start();
        hilo2.start();

    }
}
