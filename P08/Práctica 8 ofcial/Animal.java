public abstract class Animal{
    private int ID, posicion;
    private String nombre;

    //Getters
    public int getID(){
        return ID;
    }
    public String getNombre(){
        return nombre;
    }
    //Setters
    public void setID(int ID){
        this.ID = ID;
    }
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Métodos
    public int reportarPosicion(){
        return posicion;
    }
    public void festejar(){
        System.out.println("Y puros corridos tumbados eaaaaaaa!!!!!!!");
    }
    public abstract void avanzar();
    public abstract void hablar();
}