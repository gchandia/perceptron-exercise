package logic;

public class SigmoidNeuron {
  private int bias;
  private int weight1;
  private int weight2;
  
  public SigmoidNeuron(int bias, int weight1, int weight2) {
    this.setBias(bias);
    this.setWeight1(weight1);
    this.setWeight2(weight2);
  }

  /**
   * Permite obtener el bias que posee el sigmoid neuron.
   * @return bias del sigmoid neuron
   */
  public int getBias() {
    return bias;
  }

  /**
   * Permite establecer el bias a traves del constructor de la clase.
   * @param bias es el bias que tendra el sigmoid neuron
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
   * Permite establecer el peso del primer input con el que el sigmoid neuron toma una decision.
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
   * Permite establecer el peso del segundo input con el que el sigmoid neuron toma una decision.
   * @param weight2 es el peso que tendra el segundo input
   */
  private void setWeight2(int weight2) {
    this.weight2 = weight2;
  }
  
  /**
   * Opera sobre los inputs para tomar una decision.
   * @param input1 el primer input que recibe el sigmoid neuron en forma de un bit 0 o 1
   * @param input2 el segundo input que recibe el sigmoid neuron en forma de un bit 0 o 1
   * @return 0 si la formula de decision es menor o igual a 0, 1 si es mayor
   */
  public int getOutput(int input1, int input2) {
    if (1/(1 + Math.exp(-input1 * weight1 -input2 * weight2 - bias)) > 0.5) {
      return 1;
    }
    return 0;
  }
}