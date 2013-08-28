package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionNegationShouldBe {
  @Test
  public void negativeWhenTheNumeratorIsNegative() {
    assertThat("-10/11 = -(10/11)", new Fraction(-10, 11),
        is(equalTo(new Fraction(10,11).negate())));
  }

  @Test
  public void negativeWhenTheDenominatorIsNegative() {
    assertThat("10/-11 = -(10/11)", new Fraction(10, -11),
        is(equalTo(new Fraction(10,11).negate())));
  }
}
