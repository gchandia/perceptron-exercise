package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.Perceptron;

public class ORPerceptronTest {
  Perceptron orPerceptron;
  
  @Before
  public void setUp() {
    orPerceptron = new Perceptron(-1, 2, 2);
  }

  @Test
  public void test() {
    assertEquals(orPerceptron.getOutput(0, 0), 0);
    assertEquals(orPerceptron.getOutput(0, 1), 1);
    assertEquals(orPerceptron.getOutput(1, 0), 1);
    assertEquals(orPerceptron.getOutput(1, 1), 1);
  }
}