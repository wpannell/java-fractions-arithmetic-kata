package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionSubtractionShouldBe {
  @Test
  public void theFractionWhenAdditiveIdentityIsSubtracted() {
    assertThat("1/199 - 0/100 = 1/199)",
        new Fraction(1,199).minus(new Fraction(0,100)),
        is(equalTo(new Fraction(1,199))));
  }

  @Test
  public void theNegationWhenAFractionIsSubtractedFromAdditiveIdentity() {
    assertThat("0/100 - 1/199 = -1/199)",
        new Fraction(0,100).minus(new Fraction(1,199)),
        is(equalTo(new Fraction(-1,199))));
  }

  @Test
  public void crossMultipliedAndSubtractedWhenTheDenominatorsAreUnequal() {
    assertThat("4/7 - 11/13 = -25/91)",
        new Fraction(4, 7).minus(new Fraction(11, 13)),
        is(equalTo(new Fraction(25, 91).negate())));

    assertThat("-4/7 - 11/13 = 25/91)",
        new Fraction(4, 7).negate().minus(new Fraction(11, 13)),
        is(equalTo(new Fraction(129, 91).negate())));

    assertThat("-4/7 - -11/13)",
        new Fraction(4, 7).negate().minus(new Fraction(11, 13).negate()),
        is(equalTo(new Fraction(25, 91))));
  }
}
