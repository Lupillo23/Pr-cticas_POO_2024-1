public class Humano implements ActividadesBasicas {
    public String nombre;
    
    //Constructor
    public Humano(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void alimentarse(){
        System.out.println("*Busca su comida en el refrigerador*");
    }

    @Override
    public void descansar(){
        System.out.println("*Se acuesta en su camita*");
    }
}
