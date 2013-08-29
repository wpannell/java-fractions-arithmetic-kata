package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionSubtractionShouldBe {
  @Test
  public void theFractionWhenZeroIsSubtractedFromAnyFraction() {
    assertThat("1/199 - 0/100)",
        TestData.oneOver199.minus(TestData.zeroOver100),
        is(TestData.oneOver199));
  }
}
