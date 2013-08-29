package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionMultiplicationShouldBe {
  private static int j = 11;

  @Test
  public void zeroWhenAnyFractionIsZero() {
    assertThat("0/13 * 0/7", new Fraction(0, 13).times(new Fraction(0, 7)),
        is(equalTo(Fraction.ZERO)));

    assertThat("0/13 * 3/7", new Fraction(0, 13).times(new Fraction(3, 7)),
        is(equalTo(Fraction.ZERO)));
  }
}
