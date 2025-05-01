public class Alien implements ActividadesBasicas{
    private String planeta;

    public Alien(String planeta){
        this.planeta = planeta;
    }

    public String getPlaneta(){
        return planeta;
    }

    @Override
    public void alimentarse(){
        System.out.println("*Abduce una vaca*");
    }
    
    @Override
    public void descansar(){
        System.out.println("*Se conecta a la luz*");
    }
}
