public class Perrito {
    private String nombre = new String();
    private int edad;
    private String tamañoActual = new String();
    private String tamañoMax = new String();

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTamañoActual(String tamañoActual){
        this.tamañoActual =  tamañoActual;
    }
    public void setTamañoMax(String tamañoMax){
        this.tamañoMax = tamañoMax;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getTamañoActual(){
        return tamañoActual;
    }
    public String getTamañoMax(){
        return tamañoMax;
    }

    //Métodos
    public void ladrar(){
        System.out.println("Guau!!");
    }
    public void lamerLaCara(){
        System.out.println("*EL perrito lame la cara al humano*");
    }

    //Constructores
    public Perrito(int edad, int tamañoActual, int tamañoMax){
        this.nombre = "Sin nombre";
        setEdad(edad);
        setTamañoActual(tamañoActual);
        setTamañoMax(tamañoMax);
    }
    public Perrito(){
        nombre = "Solovino";
        edad = 0;
        tamañoActual = "pequeño";
        tamañoMax = "desconocido";
    }
}
