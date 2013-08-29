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

  @Test
  public void positiveWhenBothNumeratorAndDenominatorAreNegative() {
    assertThat("-10/-11 = 10/11", new Fraction(-10, -11),
        is(equalTo(new Fraction(10,11))));
  }

  @Test
  public void zeroWhenTheNumeratorIs0andTheDenominatorIsNegative() {
    assertThat("0/-11 = 0", new Fraction(0, -11),
        is(equalTo(Fraction.ZERO)));
  }

  @Test
  public void negativeWhenTheFractionIsNegated() {
    assertThat("-(7/11) = -7/11", new Fraction(7, 11).negate(),
        is(equalTo(new Fraction(-7, 11))));
  }

  @Test
  public void positiveWhenANegativeFractionIsNegated() {
    assertThat("-(-7/11) = -7/11", new Fraction(-7, 11).negate(),
        is(equalTo(new Fraction(7, 11))));
  }
}
