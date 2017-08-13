from Perceptron import Perceptron

import random
import matplotlib.pyplot as plt

my_perceptron = Perceptron(5, 0, 0, 1, 0)
train_cycles = 100

weights = my_perceptron.train(train_cycles)

f1 = plt.figure()
f2 = plt.figure()
ax1 = f1.add_subplot(111)
ax2 = f2.add_subplot(111)

test_cycles = 100

while test_cycles > 0:
    random_x = random.uniform(-60, 60)
    random_y = random.uniform(-60, 60)

    output = my_perceptron.getoutput(random_x, random_y)

    if output == 0:
        ax1.plot(random_x, random_y, 'bo')
    else:
        ax1.plot(random_x, random_y, 'ro')

    test_cycles -= 1

test = [0] * 100
i = 100

while i > 0:
    test[i - 1] = i
    i -= 1

ax2.plot(test, weights, '-o')

ax1.axis([-60, 60, -60, 60])
x1, y1 = [-60, 60], [-60, 60]
ax1.axhline(0, color='black')
ax1.axvline(0, color='black')
ax1.plot(x1, y1)

plt.show()
