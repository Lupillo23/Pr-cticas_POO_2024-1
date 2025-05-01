public class TacoDeSuadero{
    String conSalsa;
    String tipoDeSalsa;
    private float precioTacoSuadero;
    public TacoDeSuadero(){
        precioTacoSuadero = 15.5f;
        conSalsa = "no";
    }

    public void setConSalsa(String conSalsa){
        this.conSalsa = conSalsa;
    }
    public void setTipoDeSalsa(String tipoDeSalsa){
        this.tipoDeSalsa = tipoDeSalsa;
    }

    public float getPrecioTacoSuadero(){
        return precioTacoSuadero;
    }
}