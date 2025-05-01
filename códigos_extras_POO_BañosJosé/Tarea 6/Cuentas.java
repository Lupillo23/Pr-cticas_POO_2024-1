import java.util.Scanner;

public class Cuentas {
    Scanner entrada = new Scanner(System.in);
    int limite;

    public Cuentas(){
        limite = 0;
    }
    //Cuenta de 2 en 2
    public void pares(){
        try{
            System.out.println("Ingrese el limite hasta el cual se va a imprimir la cuenta");
            limite = entrada.nextInt();

            //Condicion de la excepción creada
            if(limite <= 0){
                throw new MiExcepcion();
            }

            //Impresion de la sucesion(cuenta)
            System.out.println("Se muestra la sucesion de numeros de 2 en 2 desde 0 hasta " + limite);
            for(int i = 0; i <= limite; i += 2){
                System.out.println(i);
            }
        }
        catch(MiExcepcion excepcion1){
            System.err.println(excepcion1.toString());
        }
    }

    public void sucesionDe3()throws MiExcepcion{

        System.out.println("Ingrese el limite hasta el cual se va a imprimir la cuenta");
        int limite = entrada.nextInt();

        if(limite < 0){
            throw new MiExcepcion();
        }

        //Impresion de la sucesion(cuenta)
        System.out.println("Se muestra la sucesion de numeros de 3 en 3 desde 0 hasta " + limite);
        for(int i = 0; i <= limite; i += 3){
            System.out.println(i);
        }
    }
}


