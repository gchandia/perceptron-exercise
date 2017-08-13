import random

"""
 * Clase que permite representar el comportamiento de un perceptron que recibe dos inputs por operacion.
 * @author gch1204 e-mail: gch102441@gmail.com
 *
"""


class Perceptron:

    def __init__(self, bias, weight1, weight2, slope, intercept):
        self.bias = bias
        self.weight1 = weight1
        self.weight2 = weight2
        self.slope = slope
        self.intercept = intercept

    def get_weight1(self):
        return self.weight1

    """
    * Opera sobre los inputs para tomar una decision.
    * @ param input1 el primer input que recibe el perceptron en forma de un bit 0 o 1
    * @ param input2 el segundo input que recibe el perceptron en forma de un bit 0 o 1
    * @ return 0 si la formula de decision es menor o igual a 0, 1 si es mayor
    """
    def getoutput(self, input1, input2):
        if input1*self.weight1 + input2*self.weight2 + self.bias <= 0:
            return 0
        return 1

    """
    * Permite obtener el output deseado para problema de ubicar punto sobre una linea.
    * @ param input1 el primer input que recibe el perceptron en forma de un bit 0 o 1
    * @ param input2 el segundo input que recibe el perceptron en forma de un bit 0 o 1
    * @ return 0 si la formula de decision es menor o igual a 0, 1 si es mayor
    """

    def desired_output(self, input1, input2):
        if self.slope * input1 + self.intercept < input2:
            return 1
        return 0

    """
    * Fase de entrenamiento del perceptron que ira generando inputs aleatorios y modificando pesos de manera acorde.
    * @ param training_cycles cantidad de ciclos de entrenamiento del perceptron
    """
    def train(self, training_cycles):
        training_weights = [0.0] * training_cycles
        training_weights[training_cycles - 1] = ((self.weight1 + self.weight2) / 2.0)

        while training_cycles > 0:
            random_x = random.uniform(-60, 60)
            random_y = random.uniform(-60, 60)
            output = self.getoutput(random_x, random_y)
            desired_output = self.desired_output(random_x, random_y)

            if output < desired_output:
                self.weight1 += 0.01 * random_x
                self.weight2 += 0.01 * random_y

            elif output > desired_output:
                self.weight1 -= 0.01 * random_x
                self.weight2 -= 0.01 * random_y

            training_weights[training_cycles - 1] = ((self.weight1 + self.weight2) / 2.0)

            training_cycles -= 1

        return training_weights
