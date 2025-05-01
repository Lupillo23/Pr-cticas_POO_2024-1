public class Gato{
	private String color;
	private int edad;

	public Gato(String color, int edad){
		this.color = color;
		this.edad = edad;
	}

	public Gato(){
//		color="generico";
//		edad=100;
	}

	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor(){
		return color;
	}

	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public int getEdad(){
		return edad;
	}

	public void comer()
	{
		System.out.println("Estoy comiendo...");
	}
	void dormir()
	{
		System.out.println("...zzzZZZZ");
	}
	void hablar()
	{
		System.out.println("Miau");
	}
}