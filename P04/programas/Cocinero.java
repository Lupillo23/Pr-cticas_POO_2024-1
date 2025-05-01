/**
 * Clase Cocinero
 * Describe las caracteristicas de una clase Cocinero y sus metodos
 * @author Jhonatan
 * @author José
 */
public class Cocinero{
	String nombre;
	static float salario = 10000f;
	String turno;

	public Cocinero(){
		this("Chefsito","Nocturno");
		Cocinero.salario = 20000f;
	}
	public Cocinero(String nombre, String turno){
		this.nombre = nombre;
		this.turno = turno;
	}

	public void prepararPizzaHawaiana(){
		System.out.println("*Se prepara una pizza con jamòn, piña, queso mozzarella y cereza*");
	}
	public void prepararPizzaHawaiana(String ingredienteExtra){
		System.out.println("*Se prepara una pizza con jamòn, piña, queso mozzarella, cereza y "+ingredienteExtra.toLowerCase()+"*");
	}
}