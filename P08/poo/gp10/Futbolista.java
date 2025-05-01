package poo.gp10;
public class Futbolista extends Deportista{
	private String equipo;	

	public Futbolista(String nombre, int edad, int antiguedad, int horasDeEntrenamientoNormal, int totalHorasEntrenadas, String equipo){
		super(nombre,edad,antiguedad,horasDeEntrenamientoNormal,totalHorasEntrenadas);
		this.equipo = equipo;
	}
}