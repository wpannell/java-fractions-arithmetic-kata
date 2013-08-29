package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionDivisionShouldBe {
  @Test(expected = ArithmeticException.class)
  public void throwExceptionWhenDivideByZero() throws Exception {
    assertThat("1/13 / 0/7", new Fraction(1, 13).divide(new Fraction(0, 7)),
        is(equalTo(Fraction.ZERO)));
  }
}
