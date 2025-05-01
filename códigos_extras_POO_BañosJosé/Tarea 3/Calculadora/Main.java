import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float numeros1[] = new float[5];
        Sumadora sumadora = new Sumadora();

        //Suma de 2 valores
        System.out.println("Ingrese 2 valores a sumar:");
        System.out.println("Valor 1");
        float n1 = entrada.nextFloat();
        System.out.println("Valor 2");
        float n2 = entrada.nextFloat();
        System.out.println("La suma de "+ n1 + " + " + n2 + " es " + sumadora.suma1(n1,n2));

        //suma de 3 valores
        System.out.println("\nIngrese 3 valores a sumar:");
        System.out.println("Valor 1");
        n1 = entrada.nextFloat();
        System.out.println("Valor 2");
        n2 = entrada.nextFloat();
        System.out.println("Valor 3");
        float n3 = entrada.nextFloat();
        System.out.println("La suma de "+ n1 + " + " + n2 + " + " + n3 + " es " + sumadora.suma2(n1,n2,n3));

        //Suma de 5 valores
        System.out.println("\nIngrese 5 valores a sumar:");
        for (int i = 0; i < 5; i++) { 
            System.out.println("Ingrese un valor para sumar:");
            numeros1[i] = entrada.nextFloat();
        }

        float resultado = sumadora.suma3(numeros1);
        System.out.println("La suma de los valores es: " + resultado);
    }
}
