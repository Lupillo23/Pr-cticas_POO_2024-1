public class GatoDeLaCasa extends Gato {
    private String nombre = new String();

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void molestarALaKaren(){
        System.out.println("Molesta a la karen...");
    }

    public GatoDeLaCasa(String nombre, String color, int edad){
        super(color, edad);
        this.nombre = nombre;
    }
    public GatoDeLaCasa(){
        super();
    }
}
