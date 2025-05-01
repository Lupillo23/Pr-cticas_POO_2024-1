public class TacoDePastor{
    String conSalsa;
    String tipoDeSalsa;
    private float precioTacoPastor;
    public TacoDePastor(){
        precioTacoPastor = 12.5f;
        conSalsa = "no";
    }

    public void setConSalsa(String conSalsa){
        this.conSalsa = conSalsa;
    }
    public void setTipoDeSalsa(String tipoDeSalsa){
        this.tipoDeSalsa = tipoDeSalsa;
    }

    public float getPrecioTacoPastor(){
        return precioTacoPastor;
    }
}