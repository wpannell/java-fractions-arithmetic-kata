package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

public class FractionDivisionShouldBe {
  @Test(expected = ArithmeticException.class)
  public void throwExceptionWhenDivideByZero() throws Exception {
    new Fraction(1, 13).divide(new Fraction(0, 7));
  }
}
