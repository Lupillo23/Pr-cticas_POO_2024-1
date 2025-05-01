package poo.gp10;
public class Corredor extends Deportista{
	private String modalidad;

	public Corredor(String nombre, int edad, int antiguedad, int horasDeEntrenamientoNormal, int totalHorasEntrenadas, String modalidad){
		super(nombre,edad,antiguedad,horasDeEntrenamientoNormal,totalHorasEntrenadas);
		this.modalidad = modalidad;
	}

	public void setModalidad(String modalidad){
		this.modalidad = modalidad;
	}
	public String getModalidad(){
		return modalidad;
	}

	public void entrenarParaCompetencia(int horasExtras){
		super.entrenar();
		System.out.println("Estoy entrenando para competir");
		int horasTotales = this.getTotalHorasEntrenadas() + horasExtras;
		this.setTotalHorasEntrenadas(horasTotales);
	}

	@Override
	public void competir(){
		System.out.println("Corro una carrera");
	}
}