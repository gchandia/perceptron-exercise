package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.Perceptron;

public class NANDPerceptronTest {
  Perceptron nandPerceptron;
  
  @Before
  public void setUp() {
    nandPerceptron = new Perceptron(3, -2, -2);
  }

  @Test
  public void test() {
    assertEquals(nandPerceptron.getOutput(0, 0), 1);
    assertEquals(nandPerceptron.getOutput(0, 1), 1);
    assertEquals(nandPerceptron.getOutput(1, 0), 1);
    assertEquals(nandPerceptron.getOutput(1, 1), 0);
  }
}