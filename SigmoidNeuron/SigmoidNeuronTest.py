from SigmoidNeuron import SigmoidNeuron

import random
import matplotlib.pyplot as plt

my_sigmoid_neuron = SigmoidNeuron(5, 0, 0, 1, 0)
train_cycles = 200

sigmoid_neuron_precision = my_sigmoid_neuron.super_train(train_cycles)

f1 = plt.figure()
f2 = plt.figure()
ax1 = f1.add_subplot(111)
ax2 = f2.add_subplot(111)

test_cycles = 100

while test_cycles > 0:
    random_x = random.uniform(-60, 60)
    random_y = random.uniform(-60, 60)

    output = my_sigmoid_neuron.getoutput(random_x, random_y)

    if output == 0:
        ax1.plot(random_x, random_y, 'bo')
    else:
        ax1.plot(random_x, random_y, 'ro')

    test_cycles -= 1

cycles = [0] * train_cycles

for i in range(len(cycles)):
    cycles[i] = i

ax2.plot(cycles, sigmoid_neuron_precision)

ax1.axis([-60, 60, -60, 60])
x1, y1 = [-60, 60], [-60, 60]
ax1.axhline(0, color='black')
ax1.axvline(0, color='black')
ax1.plot(x1, y1)

plt.show()
