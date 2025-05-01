import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        //Se crean objetos de las clases a utilizar
        FormatoDePantalla formatoDePantalla = new FormatoDePantalla();
        Cliente cliente1 = new Cliente();
        Scanner entrada = new Scanner(System.in);
        String taco = new String();
        String conSalsa = new String();
        String tipoDeSalsa = new String();
        float montoActual = 0;
        int tacosConSalsa = 0;
        int tacosSinSalsa = 0;
        String palabraDeSalida = "";
        String opcion = "si";

        //Menu
        while(opcion.equalsIgnoreCase("si")){
            //Imprime el encabezado de página
            formatoDePantalla.encabezado();
            //Mensaje de bienvenida y presentación de opciones
            System.out.println("Bienvenido!!");
            System.out.println("De que tacos desea ordenar??\nOpciones:\nPastor\nSuadero");
            //Lectura de opcion elegida
            taco = entrada.nextLine();
            //Limpia el contenido de la pantalla
            formatoDePantalla.limpiarPantalla();

            if(taco.equalsIgnoreCase("pastor") || taco.equalsIgnoreCase("suadero")){
                formatoDePantalla.encabezado();
                System.out.println("Bienvenido al menú de opciones de tacos de " + taco.toLowerCase());
                System.out.println("Cuantos tacos desea ordenar??");
                int numeroDeTacos = entrada.nextInt();

                if(taco.equalsIgnoreCase("pastor")){
                    cliente1.numTacosPastor = numeroDeTacos;
                    int i = 1;
                    while(i <= numeroDeTacos){
                        TacoDePastor tacoDePastor = new TacoDePastor();

                        montoActual += tacoDePastor.getPrecioTacoPastor();

                        System.out.println("Desea agregarle salsa a su taco??");
                        conSalsa = entrada.nextLine();

                        if(conSalsa.equalsIgnoreCase("si")){
                            tacoDePastor.setConSalsa("si");
                            System.out.println("Que tipo de salsa??:\nRoja\nVerde");
                            tipoDeSalsa = entrada.nextLine();
                            if(tipoDeSalsa.equalsIgnoreCase("verde") || tipoDeSalsa.equalsIgnoreCase("roja")){
                                tacoDePastor.setTipoDeSalsa(tipoDeSalsa);
                                System.out.println("Se prepara un taco de pastor con salsa " + tipoDeSalsa);
                                cliente1.setTotalCuenta(montoActual);
                                System.out.println("Monto a pagar: " + montoActual);
                                tacosConSalsa++;
                            }    
                            else{
                                System.out.println("Opción no válida");
                                System.out.println("Se prepara un taco de pastor sin salsa");
                                System.out.println("Monto a pagar: " + montoActual);
                                tacosSinSalsa++;
                            }                    
                        }
                        else{
                            System.out.println("Se prepara un taco de pastor sin salsa.");
                            tacosSinSalsa++;
                        }
                        i++;
                    }
                    System.out.println("Escriba la palabra vale para ir a la pantalla de entrega");
                    palabraDeSalida = entrada.nextLine();
                    if (palabraDeSalida.equalsIgnoreCase("vale")){
                        formatoDePantalla.limpiarPantalla();
                        formatoDePantalla.encabezado();
                        System.out.println("Pantala de entrega.\nTacos de " + taco);
                        System.out.println("Usted ordenó" + cliente1.numTacosPastor + "de pastor");
                        System.out.println(tacosConSalsa + "con salsa y " + tacosSinSalsa + " sin salsa");
                        System.out.println("Total de la cuenta: " + cliente1.getTotalCuenta());
                    }
                }
                else{
                    cliente1.numTacosSuadero = numeroDeTacos;
                    int j = 1;
                    while(j <= numeroDeTacos){
                        TacoDeSuadero tacoDeSuadero = new TacoDeSuadero();
                        montoActual += tacoDeSuadero.getPrecioTacoSuadero();

                        System.out.println("Desea agregarle salsa a su taco??");
                        conSalsa = entrada.nextLine();

                        if(conSalsa.equalsIgnoreCase("si")){
                            tacoDeSuadero.setConSalsa("si");
                            System.out.println("Que tipo de salsa??:\nRoja\nVerde");
                            tipoDeSalsa = entrada.nextLine();
                            if(tipoDeSalsa.equalsIgnoreCase("verde") || tipoDeSalsa.equalsIgnoreCase("roja")){
                                tacoDeSuadero.setTipoDeSalsa(tipoDeSalsa);
                                System.out.println("Se prepara un taco de suadero con salsa " + tipoDeSalsa);
                                cliente1.setTotalCuenta(montoActual);
                                System.out.println("Monto a pagar: " + montoActual);
                                tacosConSalsa++;
                            }    
                            else{
                                System.out.println("Opción no válida");
                                System.out.println("Se prepara un taco de Suadero sin salsa");
                                System.out.println("Monto a pagar: " + montoActual);
                                tacosSinSalsa++;
                            }                    
                        }
                        else{
                            System.out.println("Se prepara un taco de suadero sin salsa.");
                            tacosSinSalsa++;
                        }
                        j++;
                    }
                    System.out.println("Escriba la palabra vale para ir a la pantalla de entrega");
                    palabraDeSalida = entrada.nextLine();
                    if (palabraDeSalida.equalsIgnoreCase("vale")){
                        formatoDePantalla.limpiarPantalla();
                        formatoDePantalla.encabezado();
                        System.out.println("Pantala de entrega.\nTacos de " + taco);
                        System.out.println("Usted ordenó" + cliente1.numTacosSuadero + "de suadero");
                        System.out.println(tacosConSalsa + "con salsa y " + tacosSinSalsa + " sin salsa");
                        System.out.println("Total de la cuenta: " + cliente1.getTotalCuenta());
                    }
                } 
            }
            else{
                System.out.println("Opción no válida");
            }
            
            System.out.println("Desea ordenar más tacos??");
            opcion = entrada.nextLine();
        }
    }
}