package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionDivisionShouldBe {
  @Test(expected = ArithmeticException.class)
  public void anExceptionWhenDivideByZero() throws Exception {
    new Fraction(1, 13).dividedBy(new Fraction(0, 7));
  }

  @Test()
  public void theFractionWhenDividedByTheIdentity() {
    assertThat("7/13 / 30/30)",
        new Fraction(6, 12).dividedBy(new Fraction(30, 30)),
        is(new Fraction(1, 2)));
  }

  @Test()
  public void invertedAndMultiplied() {
    assertThat("7/13 / 17/5)",
        new Fraction(7, 13).dividedBy(new Fraction(17, 5)),
        is(new Fraction(35, 221)));
  }
}
