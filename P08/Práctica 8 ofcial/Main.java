public class Main {
    public static void main(String[] args){
        Humano humano1 = new Humano("pepe");
        Alien alien1 = new Alien("Titan");
        Puma puma1 = new Puma(23);

        System.out.println("###### Humano ######");
        humano1.alimentarse();
        humano1.descansar();
        System.out.println("###### Alien ######");
        alien1.alimentarse();
        alien1.descansar();
        System.out.println("###### Puma ######");
        puma1.alimentarse();
        puma1.descansar();
    }
}
