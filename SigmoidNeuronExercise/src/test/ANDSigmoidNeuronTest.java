package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.SigmoidNeuron;

public class ANDSigmoidNeuronTest {
  SigmoidNeuron andSNeuron;
  
  @Before
  public void setUp() {
    andSNeuron = new SigmoidNeuron(-3, 2, 2);
  }

  @Test
  public void test() {
    assertEquals(andSNeuron.getOutput(0, 0), 0);
    assertEquals(andSNeuron.getOutput(0, 1), 0);
    assertEquals(andSNeuron.getOutput(1, 0), 0);
    assertEquals(andSNeuron.getOutput(1, 1), 1);
  }
}