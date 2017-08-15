package logic;

/**
 * Clase que permite representar el comportamiento de un perceptron que recibe dos inputs por operacion.
 * @author gch1204 e-mail: gch102441@gmail.com
 *
 */
public class Perceptron {
  private int bias;
  private int weight1;
  private int weight2;
  
  public Perceptron(int bias, int weight1, int weight2) {
    this.setBias(bias);
    this.setWeight1(weight1);
    this.setWeight2(weight2);
  }

  /**
   * Permite obtener el bias que posee el perceptron.
   * @return bias del perceptron
   */
  public int getBias() {
    return bias;
  }

  /**
   * Permite establecer el bias a traves del constructor de la clase.
   * @param bias es el bias que tendra el perceptron
   */
  private void setBias(int bias) {
    this.bias = bias;
  }

  /**
   * Permite obtener el peso del primer input.
   * @return peso del primer input
   */
  public int getWeight1() {
    return weight1;
  }

  /**
   * Permite establecer el peso del primer input con el que el perceptron toma una decision.
   * @param weight1 es el peso que tendra el primer input
   */
  private void setWeight1(int weight1) {
    this.weight1 = weight1;
  }

  /**
   * Permite obtener el peso del segundo input.
   * @return peso del segundo input
   */
  public int getWeight2() {
    return weight2;
  }

  /**
   * Permite establecer el peso del segundo input con el que el perceptron toma una decision.
   * @param weight2 es el peso que tendra el segundo input
   */
  private void setWeight2(int weight2) {
    this.weight2 = weight2;
  }
  
  /**
   * Opera sobre los inputs para tomar una decision.
   * @param input1 el primer input que recibe el perceptron en forma de un bit 0 o 1
   * @param input2 el segundo input que recibe el perceptron en forma de un bit 0 o 1
   * @return 0 si la formula de decision es menor o igual a 0, 1 si es mayor
   */
  public int getOutput(int input1, int input2) {
    if (input1*getWeight1() + input2*getWeight2() + getBias() <= 0) {
      return 0;
    }
    return 1;
  }
}