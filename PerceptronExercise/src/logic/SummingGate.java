package logic;

/**
 * Clase que representa a un circuito de suma que utiliza como compuertas a un perceptron.
 * @author gch1204 e-mail: gch120441@gmail.com
 *
 */
public class SummingGate {
  private final Perceptron nandPerceptron = new Perceptron (3, -2, -2);
  
  /**
   * Permite obtener el bit de resultado de una suma binaria.
   * @param input1 un bit de valor 0 o 1
   * @param input2 un bit de valor 0 o 1
   * @return resultado de la suma binaria
   */
  public int getSum(int input1, int input2) {
    int firstLayer = nandPerceptron.getOutput(input1, input2);
    int secondLayerFirstResult = nandPerceptron.getOutput(input1, firstLayer);
    int secondLayerSecondResult = nandPerceptron.getOutput(input2, firstLayer);
    return nandPerceptron.getOutput(secondLayerFirstResult, secondLayerSecondResult);
  }
  
  /**
   * Permite obtener el bit de carry del resultado de sumar dos bits.
   * @param input1 un bit de valor 0 o 1
   * @param input2 un bit de valor 0 o 1
   * @return bit de carry de la suma de input1 e input2
   */
  public int getCarryBit(int input1, int input2) {
    int firstLayer = nandPerceptron.getOutput(input1, input2);
    return nandPerceptron.getOutput(firstLayer, firstLayer);
  }
}