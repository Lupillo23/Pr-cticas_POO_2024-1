package programa1;
/*
 * class Estudiante
 * @author José Baños
 */
public class Estudiante {
    private String nombre;
    private byte edad;
    private String carrera;

    //Getters
    public String getNombre(){
        return nombre;
    }
    public byte getEdad(){
        return edad;
    }
    public String getCarrera(){
        return carrera.substring(3);
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(byte edad){
        edad = validarEdad(edad);
        this.edad = edad;
    }
    public void setCarrera(String carrera){
        this.carrera = "FI " + carrera;
    }
    //Métodos
    public void pasarLista(){
        System.out.println("Presente profe!!");
    }
    private byte validarEdad(byte edad){
        if(edad < 0 || edad > 100){
            System.out.println("Edad no válida, se le asignará un valor de: 0");
            return 0;
        }
        else{
            return edad;
        }
    }
}
