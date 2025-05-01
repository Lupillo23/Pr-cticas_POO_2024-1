/**
 * Clase Perrito
 * Describe las caracteristicas de una clase Perrito y sus metodos
 * @author Jhonatan
 * @author José
 */
 public class Perrito{
    private String nombre;
    private int edadActual;
    private String tamañoActual;
    private String tamañoMaximo;

    public Perrito(){
        this(0,"pequeño","desconocido");
        nombre = "Solovino";
    }
    public Perrito(int edadActual,String tamañoActual,String tamañoMaximo){
        this.edadActual = edadActual;
        this.tamañoActual = tamañoActual;
        this.tamañoMaximo = tamañoMaximo;
        nombre = "Sin nombre";
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdadActual(int edadActual){
        this.edadActual = edadActual;
    }
    public int getEdadActual(){
        return edadActual;
    }
    public void setTamañoActual(String tamañoActual){
        this.tamañoActual = tamañoActual;
    }
    public String getTamañoActual(){
        return tamañoActual;
    }
    public void setTamañoMaximo(String tamañoMaximo){
        this.tamañoMaximo = tamañoMaximo;
    }
    public String getTamañoMaximo(){
        return tamañoMaximo;
    }

    public void ladrar(){
        System.out.println("Woooof");
    }
    public void lamerCara(){
        System.out.println("*El perrito lame la cara al humano*");
        System.out.println("     __");
        System.out.println("(___()'`;");
        System.out.println("/,     /`");
        System.out.println("\\\\---\\\\");
    }
 }