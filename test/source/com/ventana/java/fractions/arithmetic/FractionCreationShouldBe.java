package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

public class FractionCreationShouldBe {
  @Test(expected=RuntimeException.class)
  public void anExceptionForAFractionWithDenominatorZero() {
    new Fraction(1,0);
  }
}
