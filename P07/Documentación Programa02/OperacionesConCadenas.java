/*OperacionesConCadenas.java
 * @version 1.0
 * @author José Baños
 * @author Jhonatan Amaya
 */
package poo.grp10.operacionesconcadenas;
/**
 * La clase OperacionesConCadenas proporciona métodos para realizar diversas operaciones
 * con cadenas de texto.
 */
public class OperacionesConCadenas {

    /**
     * Elimina los espacios en blanco de una cadena y la imprime en la consola.
     *
     * @param cadena La cadena de entrada que se procesará.
     */
    public void sinEspacios(String cadena) {
        System.out.println(cadena.replace(" ", ""));
    }

    /**
     * Convierte una cadena a mayúsculas y la imprime en la consola.
     *
     * @param cadena La cadena de entrada que se convertirá a mayúsculas.
     */
    public void mayúsculas(String cadena) {
        System.out.println(cadena.toUpperCase());
    }

    /**
     * Reemplaza todas las apariciones del carácter 'a' por el símbolo '@' y
     * la cadena resultante se imprime en la consola.
     *
     * @param cadena La cadena de entrada en la que se realizará la sustitución.
     */
    public void arrobas(String cadena) {
        System.out.println(cadena.replace("a", "@"));
    }

    /**
     * Imprime las vocales contenidas en una cadena en minúsculas.
     *
     * @param cadena La cadena de entrada de la cual se extraen las vocales.
     */
    public void vocales(String cadena) {
        cadena = cadena.toLowerCase();

        System.out.println("Vocales en la cadena:");

        // Recorre la cadena para buscar vocales
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println(caracter);
            }
        }
    }

    /**
     * Invierte el orden de una cadena y la imprime en la consola.
     *
     * @param cadena La cadena de entrada que se invertirá.
     */
    public void cadenaInversa(String cadena) {
        // Crear una cadena vacía para almacenar la cadena invertida
        String cadenaInvertida = "";

        // Recorre la cadena desde el final al principio
        for (int i = cadena.length() - 1; i >= 0; i--) {
            char caracter = cadena.charAt(i);
            cadenaInvertida += caracter; // Agregar el carácter al final de la cadena invertida
        }
        System.out.println(cadenaInvertida);
    }

    /**
     * Imprime una subcadena de la cadena original, especificada por un rango de índices.
     *
     * @param cadena La cadena de entrada de la cual se extraerá la subcadena.
     */
    public void subcadena(String cadena) {
        System.out.println(cadena.substring(3, 8));
    }

    /**
     * Inserta el carácter 'X' en una posición específica de la cadena y la imprime en la consola.
     *
     * @param cadena La cadena en la que se insertará el carácter 'X'.
     */
    public void insertarX(String cadena) {
        StringBuilder nuevaCadena = new StringBuilder(cadena);
        nuevaCadena.setCharAt(3, 'X');
        System.out.println(nuevaCadena);
    }

    /**
     * Copia y muestra en la consola un rango de caracteres de la cadena original.
     *
     * @param cadena La cadena de entrada de la cual se copiarán los caracteres.
     */
    public void copiarCaracteres(String cadena) {
        char[] arregloCopiado = new char[10 - 5 + 1];
        int j = 0;
        for (int i = 5; i <= 10; i++) {
            arregloCopiado[j] = cadena.charAt(i);
            j++;
        }
        System.out.println(arregloCopiado);
    }
}

