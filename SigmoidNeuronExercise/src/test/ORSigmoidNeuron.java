package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.SigmoidNeuron;



public class ORSigmoidNeuron {
  SigmoidNeuron orSNeuron;
  
  @Before
  public void setUp() {
    orSNeuron = new SigmoidNeuron(-1, 2, 2);
  }

  @Test
  public void test() {
    assertEquals(orSNeuron.getOutput(0, 0), 0);
    assertEquals(orSNeuron.getOutput(0, 1), 1);
    assertEquals(orSNeuron.getOutput(1, 0), 1);
    assertEquals(orSNeuron.getOutput(1, 1), 1);
  }
}