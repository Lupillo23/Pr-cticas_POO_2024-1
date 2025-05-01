public class Main {
    public static void main(String[] args){
        Cuentas cuentas1 = new Cuentas();

        try{
            cuentas1.pares();
            cuentas1.sucesionDe3();
        }
        catch(Exception excepcion1){
            System.err.println(excepcion1.toString());
        }
        
    }
}
