package com.ventana.java.fractions.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class fractionsShouldBe {
  private static final int[] ZERO = new int[]{0, 1};

  private int[] fractions(int... nums) {
    if(nums[0] == 0 && nums[2] == 0)
      return ZERO;
    if(nums[0] == 0)
      return new int[]{nums[2], nums[3]};
    if(nums[2] == 0)
      return new int[]{nums[0], nums[1]};
    return ZERO;
  }

  @Test
  public void zeroWhenTwoZeroFractionsAreAdded() {
    assertThat(fractions(0,9,0,10), is(ZERO));
  }

  @Test
  public void theFractionWhenZeroIsAddedToAnyFraction() {
    assertThat(fractions(0,100,1,99), is(equalTo(new int[]{1,99})));
    assertThat(fractions(1,777, 0,396), is(equalTo(new int[]{1,777})));
  }
}
