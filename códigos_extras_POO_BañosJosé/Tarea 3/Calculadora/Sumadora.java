public class Sumadora {
    float resultado;
    int tamañoArreglo;

    public float suma1(float n1, float n2){
        return n1 + n2;
    }

    public float suma2(float n1, float n2, float n3){
        return n1 + n2 + n3;
    }

    public float suma3(float numeros[]) {
        resultado = 0;
        tamañoArreglo = numeros.length;
        for (int i = 0; i < tamañoArreglo; i++) { 
            resultado += numeros[i];
        }
        return resultado;
    }
}
