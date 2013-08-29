package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionSubtractionShouldBe {
  @Test
  public void theFractionWhenAdditiveIdentityIsSubtracted() {
    assertThat("1/199 - 0/100)",
        TestData.oneOver199.minus(TestData.zeroOver100),
        is(equalTo(TestData.oneOver199)));
  }

  @Test
  public void theNegationWhenAFractionIsSubtractedFromAdditiveIdentity() {
    assertThat("0/100 - 1/199)",
        TestData.zeroOver100.minus(TestData.oneOver199),
        is(equalTo(new Fraction(-1,199))));
  }

  @Test
  public void crossMultipliedAndSubtractedWhenTheDenominatorsAreUnequal() {
    assertThat("4/7 - 11/13)", TestData.fourOver7.minus(TestData.elevenOver13),
        is(equalTo(new Fraction(4*13 - 7*11, 7*13))));

    assertThat("-4/7 - 11/13)",
        TestData.fourOver7.negate().minus(TestData.elevenOver13),
        is(equalTo(new Fraction((-4*13) - (7*11), 7*13))));

    assertThat("-4/7 - -11/13)",
        TestData.fourOver7.negate().minus(TestData.elevenOver13.negate()),
        is(equalTo(new Fraction((-4*13) - (-7*11), 7*13))));
  }
}
