import java.util.Scanner;
import java.util.ArrayList;
public class CarreraDeAnimales{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		ArrayList<Animal> animales = new ArrayList<Animal>();
		Animal competidor;
		String nombre;
		String tipoDeAnimal;
		String siNo = "SI";
		String accion;
		int ide = 0;
		int meta = 0;

		System.out.println("##### BIENVENIDO A CARRERA DE ANIMALES #####");
		while(siNo.equalsIgnoreCase("si")){
			System.out.println("¿Que tipo animal vas a registrar?");
			System.out.println("¿Liebre, tortuga o perro?");
			tipoDeAnimal = entrada.nextLine();
			System.out.println("¿Cual es su nombre?");
			nombre = entrada.nextLine();
			if(tipoDeAnimal.equalsIgnoreCase("Liebre")){
				competidor = new Liebre();
				competidor.setID(ide);
				competidor.setNombre(nombre);
				animales.add(competidor);
				ide +=1;
			}else if(tipoDeAnimal.equalsIgnoreCase("Tortuga")){
				competidor = new Tortuga();
				competidor.setID(ide);
				competidor.setNombre(nombre);
				animales.add(competidor);
				ide +=1;
			}else if(tipoDeAnimal.equalsIgnoreCase("Perro")){
				competidor = new Perro();
				competidor.setID(ide);
				competidor.setNombre(nombre);
			
				animales.add(competidor);
				ide +=1;
			}else{
				System.out.println("El animal ingresado no esta disponible");
			}
			System.out.println("¿Desea registrar otro animal, SI o NO?");
			siNo = entrada.nextLine();
			System.out.print("\033[H\033[2J");
        	System.out.flush();
		}
		System.out.println("Inicia la competencia!!");
		while(meta<20){
			System.out.println("ID       NOMBRE       POSICION");
			for(Animal animal : animales){
				System.out.println(animal.getID()+"        "+animal.getNombre()+"       "+animal.reportarPosicion());
			}
			System.out.println("Ingrese el ID del animal que entrara en accion:");
			ide = entrada.nextInt();
			entrada.nextLine();
			if(ide<0 || ide>animales.size()-1){
				System.out.print("\033[H\033[2J");
        		System.out.flush();
				continue;
			}
			Animal animalAccion = animales.get(ide);
			if(animalAccion instanceof Liebre){
				System.out.print("\033[H\033[2J");
        		System.out.flush();
				System.out.println("La liebre puede hacer las siguientes acciones:");
				System.out.println("Avanzar, Hablar o comer.");
				System.out.println("¿Que deseas que haga la liebre?");
				accion = entrada.nextLine();
				if(accion.equalsIgnoreCase("avanzar")){
					((Liebre)animalAccion).avanzar();
				}else if(accion.equalsIgnoreCase("hablar")){
					((Liebre)animalAccion).hablar();
				}else if(accion.equalsIgnoreCase("comer")){
					((Liebre)animalAccion).comer();
					System.out.println("Toy comiendo ñam ñam");
				}else{
					System.out.println("Accion NO valida.");
				}
			}else if(animalAccion instanceof Tortuga){
				System.out.print("\033[H\033[2J");
        		System.out.flush();
				System.out.println("La tortuga puede hacer las siguientes acciones:");
				System.out.println("Avanzar, Hablar o descansar.");
				System.out.println("¿Que deseas que haga la tortuga?");
				accion = entrada.nextLine();
				if(accion.equalsIgnoreCase("avanzar")){
					((Tortuga)animalAccion).avanzar();
				}else if(accion.equalsIgnoreCase("hablar")){
					((Tortuga)animalAccion).hablar();
				}else if(accion.equalsIgnoreCase("descansar")){
					((Tortuga)animalAccion).descansando();
					System.out.println("Toy descansando ZZZzzz...");
				}else{
					System.out.println("Accion NO valida.");
				}
			}else{
				System.out.print("\033[H\033[2J");
        		System.out.flush();
				System.out.println("El perro puede hacer las siguientes acciones:");
				System.out.println("Avanzar o hablar.");
				System.out.println("¿Que deseas que haga el perro?");
				accion = entrada.nextLine();
				if(accion.equalsIgnoreCase("avanzar")){
					((Perro)animalAccion).avanzar();
				}else if(accion.equalsIgnoreCase("hablar")){
					((Perro)animalAccion).hablar();
				}else{
					System.out.println("Accion NO valida.");
				}
			}
			for(Animal animal : animales){
				if(animal.reportarPosicion()>meta){
					meta = animal.reportarPosicion();
				}
			}
		}
		Animal ganador = animales.get(ide);
		System.out.println(ganador.getNombre()+" esta festegando su victoria");
		ganador.festejar();
		entrada.close();
	}
}