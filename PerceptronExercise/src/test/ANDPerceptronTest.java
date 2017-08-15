package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.Perceptron;

public class ANDPerceptronTest {
  Perceptron andPerceptron;
  
  @Before
  public void setUp() {
    andPerceptron = new Perceptron(-3, 2, 2);
  }

  @Test
  public void test() {
    assertEquals(andPerceptron.getOutput(0, 0), 0);
    assertEquals(andPerceptron.getOutput(0, 1), 0);
    assertEquals(andPerceptron.getOutput(1, 0), 0);
    assertEquals(andPerceptron.getOutput(1, 1), 1);
  }
}