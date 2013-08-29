package com.ventana.java.fractions.arithmetic;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

public class FractionCreationShouldBe {
  @Test(expected=InvalidArgumentException.class)
  public void anExceptionForAFractionWithDenominatorZero() {
    new Fraction(1,0);
  }
}
