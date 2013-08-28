package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class fractionsShouldBe {
  private static final int[] ZERO = new int[]{0, 1};

  private int[] fractions(int... nums) {
    return ZERO;
  }

  @Test
  public void zeroWhenTwoZeroFractionsAreAdded() {
    assertThat(fractions(0,9,0,10), is(ZERO));
  }
}
