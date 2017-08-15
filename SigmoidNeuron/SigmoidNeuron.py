import random
import math

"""
 * Clase que permite representar el comportamiento de un sigmoid neuron que recibe dos inputs por operacion.
 * @author gch1204 e-mail: gch102441@gmail.com
 *
"""


class SigmoidNeuron:

    def __init__(self, bias, weight1, weight2, slope, intercept):
        self.bias = bias
        self.weight1 = weight1
        self.weight2 = weight2
        self.slope = slope
        self.intercept = intercept

    """
    * Opera sobre los inputs para tomar una decision.
    * @ param input1 el primer input que recibe el sigmoid neuron en forma de coordenada x
    * @ param input2 el segundo input que recibe el sigmoid neuron en forma de coordenada y
    * @ return 1 si formula esta bajo threshold, 0 si esta sobre este
    """
    def getoutput(self, input1, input2):
        gamma = - input1 * self.weight1 - input2 * self.weight2 - self.bias

        if gamma < 0:
            gamma = 1 - 1 / (1 + math.exp(gamma))
        else:
            gamma = 1 / (1 + math.exp(-gamma))

        if gamma < 0.5:
            return 1
        else:
            return 0

    """
    * Permite obtener el output deseado para problema de ubicar punto sobre una linea.
    * @ param input1 coordenada x
    * @ param input2 coordenada y
    * @ return 1 si input esta bajo linea, 0 si esta sobre linea
    """

    def desired_output(self, input1, input2):
        if self.slope * input1 + self.intercept < input2:
            return 1
        return 0

    """
    * Fase de entrenamiento del sigmoid neuron que ira generando inputs aleatorios y modificando pesos de manera acorde.
    * @ param training_cycles cantidad de ciclos de entrenamiento basico del sigmoid neuron
    """
    def train(self, training_cycles):
        error_rate = 0

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

            training_cycles -= 1

        for test_times in range(100):
            random_x = random.uniform(-60, 60)
            random_y = random.uniform(-60, 60)
            output = self.getoutput(random_x, random_y)
            desired_output = self.desired_output(random_x, random_y)

            if output != desired_output:
                error_rate += 1

        return error_rate

    """
    * Fase de entrenamiento del neuron que ira generando inputs aleatorios y modificando pesos de manera acorde.
    * @ param training_cycles cantidad de ciclos de entrenamiento del sigmoid neuron
    """

    def super_train(self, training_cycles):
        training_rate = [0.0] * training_cycles
        for i in range(training_cycles):
            rate = self.train(i)
            training_rate[i] = rate / 100.0

        return training_rate
