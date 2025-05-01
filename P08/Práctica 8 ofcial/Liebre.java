public class Liebre extends Animal{
	String estado;

	public void avanzar(){
		estado = "compitiendo";
		int nuevaPosicion = reportarPosicion() + 3;
		setPosicion(nuevaPosicion);
		System.out.println("Avanzo tres posiciones");
	}
	public void hablar(){
		System.out.println("Que hay de nuevo viejo!!");
	}
	public void comer(){
		estado = "comiendo";
	}
}