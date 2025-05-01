/**
 * Clase Ejercicio01
 * Pregunta por una pizza hawaiana o normal e imprime la preparacion y sueldo de los cocineros
 * @author Jhonatan
 * @author José
 */
import java.util.Scanner;
public class Ejercicio01{
	public static void main(String[] args){
		Cocinero c1 = new Cocinero("Lazlo Lozla","Matutino");
		Cocinero c2 = new Cocinero("Pepe Pecas","Mautino");
		String opcion;
		String ingredienteExtra;
		Scanner entrada = new Scanner(System.in);
		UtilidadesVarias.imprimirBienvanida();
		System.out.println("Hoy tenemos pizzas Hawaianas simples y especiales.");
		System.out.println("¿Que pizza vas a ordenar?");
		System.out.println("A)Hawaiana simple.");
		System.out.println("B)Hawaiana especial.");
		opcion = entrada.next();
		if(opcion.equalsIgnoreCase("A")){
			c1.prepararPizzaHawaiana();
		}
		else{
			System.out.println("Para la Hawaiana especial puedes elegir un ingrediente extra.");
			System.out.println("Tenemos Tocino, pepperoni, extraqueso y camarones.");
			System.out.println("Porfavor escribe el ingrediente extra que quieres en tu pizza.");
			ingredienteExtra = entrada.next();
			c2.prepararPizzaHawaiana(ingredienteExtra);
		}

		System.out.println("Conoce el salario de nuestros cocineros:");
		System.out.println("Cocinero "+c1.nombre+" su salario es de "+c1.salario);
		System.out.println("Cocinero "+c2.nombre+" su salario es de "+c2.salario);
		System.out.println("Ha llegado nuestro cocinero estrella y ahora los salarios han cambiado.");
		Cocinero c3 = new Cocinero();
		/*
		Debido a que el atributo "salario" es estatico, al cambiar el valor de este, automaticamente
		el atributo "salario" de los demas objetos cambia, esto se nota en el programa gracias a que el contrutor
		que no recibe paramestros modifica este atributo.
		*/
		System.out.println("Conoce el nuevo salario de nuestros cocineros:");
		System.out.println("Cocinero "+c1.nombre+" su salario es de "+c1.salario);
		System.out.println("Cocinero "+c2.nombre+" su salario es de "+c2.salario);
		System.out.println("Cocinero "+c3.nombre+" su salario es de "+c3.salario);

		entrada.close();
		
	}
}