package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.SummingGate;

public class SummingGateTest {
  SummingGate mySummingGate;
  
  @Before
  public void setUp() {
    mySummingGate = new SummingGate();
  }
  
  @Test
  public void sumTest() {
    assertEquals(mySummingGate.getSum(0, 0), 0);
    assertEquals(mySummingGate.getSum(0, 1), 1);
    assertEquals(mySummingGate.getSum(1, 0), 1);
    assertEquals(mySummingGate.getSum(1, 1), 0);
  } 
  
  @Test
  public void carryBitTest() {
    assertEquals(mySummingGate.getCarryBit(0, 0), 0);
    assertEquals(mySummingGate.getCarryBit(0, 1), 0);
    assertEquals(mySummingGate.getCarryBit(1, 0), 0);
    assertEquals(mySummingGate.getCarryBit(1, 1), 1);
  }
}