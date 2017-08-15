package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.SigmoidNeuron;

public class NANDSigmoidNeuron {
  SigmoidNeuron nandSNeuron;
  
  @Before
  public void setUp() {
    nandSNeuron = new SigmoidNeuron(3, -2, -2);
  }

  @Test
  public void test() {
    assertEquals(nandSNeuron.getOutput(0, 0), 1);
    assertEquals(nandSNeuron.getOutput(0, 1), 1);
    assertEquals(nandSNeuron.getOutput(1, 0), 1);
    assertEquals(nandSNeuron.getOutput(1, 1), 0);
  }
}