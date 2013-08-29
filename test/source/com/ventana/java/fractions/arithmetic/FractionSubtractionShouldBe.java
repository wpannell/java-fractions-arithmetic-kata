package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionSubtractionShouldBe {
  @Test
  public void theFractionWhenZeroIsSubtractedFromAnyFraction() {
    assertThat("0/100 - 1/199)",
        TestData.zeroOver100.minus(TestData.oneOver199),
        is(new Fraction(-1,199)));

    assertThat("1/199 + 0/100)", TestData.oneOver199.plus(TestData.zeroOver100),
        is(TestData.oneOver199));
  }
}
