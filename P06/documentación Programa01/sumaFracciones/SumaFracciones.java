/*SumaFracciones.java
 * @version 1.0
 * @author Jhonatan Amaya
 * @author José Baños
 */
package poo.grp10.operacionesmatematicas;
/**
 * La clase SumaFracciones proporciona métodos para realizar operaciones con fracciones,
 * incluyendo la suma de dos fracciones y el cálculo del máximo común divisor (MCD).
 */
public class SumaFracciones {
  /**
   * Calcula el Máximo Común Divisor (MCD) de dos números enteros utilizando el algoritmo de Euclides.
   *
   * @param a El primer número entero.
   * @param b El segundo número entero.
   * @return El MCD de los dos números enteros.
   */
  private int calcularMCD(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
  }

  /**
   * Realiza la suma de dos fracciones representadas por sus numeradores y denominadores.
   *
   * @param numA El numerador de la primera fracción.
   * @param denA El denominador de la primera fracción.
   * @param numB El numerador de la segunda fracción.
   * @param denB El denominador de la segunda fracción.
   * @return Un arreglo de enteros que contiene el resultado de la suma en su forma simplificada:
   *         - [0]: La parte entera del resultado.
   *         - [1]: El numerador del resultado.
   *         - [2]: El denominador del resultado.
   *         Si alguno de los denominadores es cero, retorna null.
   */
  public int[] sumaDosFracciones(int numA, int denA, int numB, int denB) {
      if (denA == 0 || denB == 0) {
          return null;
      }
      int[] resultado = new int[3];
      int sumaNum = 0;
      int denAbs = 1;
      int enteros = 0;
      int mdc = 0;
      if (denA == denB) {
          sumaNum = numA + numB;
          denAbs = denA;
      } else {
          denAbs = denA * denB;
          sumaNum = (numA * denB) + (numB * denA);
      }
      if (sumaNum > denAbs) {
          enteros = sumaNum / denAbs;
          sumaNum = sumaNum % denAbs;
      }
      mdc = this.calcularMCD(sumaNum, denAbs);
      sumaNum /= mdc;
      denAbs /= mdc;
      resultado[0] = enteros;
      resultado[1] = sumaNum;
      resultado[2] = denAbs;
      return resultado;
  }
}
