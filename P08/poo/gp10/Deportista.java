package poo.gp10;
public class Deportista{
	protected String nombre;
	private int edad;
	protected int antiguedad;
	private int horasDeEntrenamiento;
	private int totalHorasEntrenadas;

	public Deportista(String nombre,int edad,int antiguedad,int horasDeEntrenamiento,int totalHorasEntrenadas){
		this.nombre = nombre;
		this.edad = edad;
		this.antiguedad = antiguedad;
		this.horasDeEntrenamiento = horasDeEntrenamiento;
		this.totalHorasEntrenadas = totalHorasEntrenadas;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public int getEdad(){
		return edad;
	}
	public void setAntiguedad(int antiguedad){
		this.antiguedad = antiguedad;
	}
	public int getAntiguedad(){
		return antiguedad;
	}
	public void setHorasDeEntrenamiento(int horasDeEntrenamiento){
		this.horasDeEntrenamiento = horasDeEntrenamiento;
	}
	public int getHorasDeEntrenamiento(){
		return horasDeEntrenamiento;
	}
	public void setTotalHorasEntrenadas(int totalHorasEntrenadas){
		this.totalHorasEntrenadas = totalHorasEntrenadas;
	}
	public int getTotalHorasEntrenadas(){
		return totalHorasEntrenadas;
	}

	public void entrenar(){
		System.out.println("Estoy entrenando");
		totalHorasEntrenadas += horasDeEntrenamiento;
	}
	public void competir(){
		System.out.println("Estoy compitiendo");
	}
}