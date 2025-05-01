public class Perro extends Animal{

	public void avanzar(){
		int nuevaPosicion = reportarPosicion() + 4;
		setPosicion(nuevaPosicion);
		System.out.println("Avanzo cuatro posiciones");
	}
	public void hablar(){
		System.out.println("Wof, wof!!");
	}

}