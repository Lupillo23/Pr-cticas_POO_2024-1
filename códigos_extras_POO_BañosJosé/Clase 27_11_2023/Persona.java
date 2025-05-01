public class Persona implements Runnable{
    private String tareaAsignada;
    private String nombre;
    private Acciones acciones2;

    public Persona(String nombre, String tareaAsignada, Acciones acciones2){
        this.nombre = nombre;
        this.tareaAsignada = tareaAsignada;
        this.acciones2 = acciones2;
    }
    @Override
    public void run() {
        if(tareaAsignada.equalsIgnoreCase("comprarBoletos")){
            acciones2.comprarBoletos();
        }
        else if(tareaAsignada.equalsIgnoreCase("comprarComida")){
            acciones2.comprarComida();
        }
    }
}