public class FormatoDePantalla {
    public void encabezado(){
        System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
        System.out.println("PUMA TACO VIRTUAL FI\nSistema automatizado de venta de taquitos.");
        System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
    }

    public void bottom(){
        System.out.println("=============================================================================");
        System.out.println("Facultad de Ingeniería, UNAM\nTodos los derechos reservados. 2023.");
        System.out.println("=============================================================================");
    }

    public void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
