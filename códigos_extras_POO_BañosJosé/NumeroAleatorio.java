import java.util.Scanner;
import java.security.SecureRandom;
public class NumeroAleatorio{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String respuesta = new String();
        int guess = 0;
        int numero = 0;
        NumeroMagico numeroMagico = new NumeroMagico();

        System.out.println("Quieres jugar?");
        respuesta = entrada.nextLine();
        if(respuesta.equalsIgnoreCase("Si")){
            System.out.println("Quiere poner un valor límite?");
            respuesta = entrada.nextLine();
                if(respuesta.equalsIgnoreCase("si")){
                    System.out.println("Ingrese el límite");
                    int limite = entrada.nextInt();

                    numero = numeroMagico.numAleatorio(limite);

                    System.out.println("Adivine el número mágico");
                    guess = entrada.nextInt();

                    if(guess == numero){
                        System.out.println("Felicidades usted ha ganado!!");
                    }
                    else{
                        System.out.println("Mala suerte, el número mágico es: " + numero);
                    }
                }
                else{
                    System.out.println("Adivine el número mágico: ");
                    guess = entrada.nextInt();
                    numero = numeroMagico.numAleatorio();
                    if(guess == numero){
                        System.out.println("Felicidades usted ha ganado!!");
                    }
                    else{
                        System.out.println("Mala suerte, el número mágico es: " + numero);
                    }
                }  
        }
        else{
            System.out.println("Adios");
        }
    }
}

class NumeroMagico {
    int limite;
    public NumeroMagico(){
        limite = 10;
    }
    public int numAleatorio (){
        SecureRandom generadorNumAleatorios = new SecureRandom();
        int numAleatorio = generadorNumAleatorios.nextInt(limite);
        return numAleatorio;
    }
    public NumeroMagico (int limite2){
        this.limite=limite2;
    }
      public int numAleatorio (int limite){
        SecureRandom generadorNumAleatorios = new SecureRandom();
        int numAleatorio = generadorNumAleatorios.nextInt(this.limite);
        return numAleatorio;
    }
}
