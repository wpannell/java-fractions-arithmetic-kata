package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionMultiplicationShouldBe {
  private static int n = 13;
  private static int m = 7;
  private static int i = 3;
  private static int j = 11;

  @Test
  public void zeroWhenAnyFractionIsZero() {
    assertThat("0/n * 0/m", new Fraction(0,n).times(new Fraction(0,m)),
        is(equalTo(new Fraction(0,m))));

    assertThat("0/n * i/m", new Fraction(0,n).times(new Fraction(i,m)),
        is(equalTo(new Fraction(0,m))));
  }
}
